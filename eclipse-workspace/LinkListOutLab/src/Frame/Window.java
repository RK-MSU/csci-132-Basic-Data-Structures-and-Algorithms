package Frame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import LinkList.LinkList;
import Main.Driver;

/**
 * @author Simon Buchan
 * @author River Kelly
**/
public class Window extends JFrame implements ActionListener, ChangeListener {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Window Menu = null;
	private static Menu menu;
	private static Window inst;
	private JButton add, run, del, close, print;
	private static JPanel text;
	private Color back;
	private static Color color;
	
	public Window(){		
		JFrame frame = new JFrame("Selector");
		frame.setSize(500, 300);
		
		
		JPanel a = new JPanel();
		a.setLayout(new BoxLayout(a, BoxLayout.X_AXIS));
		
		JPanel b = new JPanel();
		b.setLayout(new BoxLayout(b, BoxLayout.Y_AXIS));
		
		JPanel text = new JPanel();
		text.setLayout(new BoxLayout(text, BoxLayout.Y_AXIS));
		
		
		add = new JButton("Add");
		add.addActionListener(this);
		add.setSize(100, 25);
		
		run = new JButton("Run");
		run.addActionListener(this);
		
		del = new JButton("Delete");
		del.addActionListener(this);
		
		print= new JButton("Print");
		print.addActionListener(this);
		
		close = new JButton("Close");
		close.addActionListener(this);
		
		color = Color.BLUE;
		
		
    	
		text.setSize(100, 100);
    	text.add(print);
    	text.add(close);
		a.add(add);
		a.add(run);
		a.add(del);
		a.add(print);
		a.add(close);
		b.add(a, BorderLayout.CENTER);
		frame.add(b, BorderLayout.NORTH);
		frame.add(text, BorderLayout.CENTER);
		
		
		
		
		
		frame.setVisible(true);
    }
    
    public static Window getInstance(){
        if(inst == null)
           inst = new Window(); 
         return inst;
    
    }
    


	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == add)
		{
			Main.Driver.addMany();
		}
		else if(e.getSource() == del)
		{
			Main.Driver.list.delete(LinkList.first);
		}
		else if(e.getSource() == run)
		{
			Driver.run(Driver.list.first, Driver.list.last, (int)(Math.random()*100), (int)(Math.random()*100));
		}
		else if(e.getSource() == close)
		{
			System.exit(0);
		}
		else if(e.getSource() == print)
		{
			Driver.list.print();
		}
		
	}
}
