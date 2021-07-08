package Componets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ButtonPanel extends JPanel implements ActionListener, ChangeListener
{
	private static JButton b1, b2, b3, b4;
	public static ButtonPanel inst;
	
	ButtonPanel()
	{
		JPanel vP = new JPanel();
		vP.setLayout(new BorderLayout(vP, BoxLayout.CENTER));
		 b1 = new JButton("Button1");
		 b2 = new JButton("Button2");
		 b3 = new JButton("Button3");
		 b4 = new JButton("Button4");
		
		b1.addActionListener(this);
		vP.add(b1);
		
		b2.addActionListener(this);
		vP.add(b2);
		
		b3.addActionListener(this);
		vP.add(b3);
		
		b4.addActionListener(this);
		vP.add(b4);
		

		
		
	}

	public static ButtonPanel getInst()
	{
		if(inst == null)
		{
			inst = new ButtonPanel();
		}
		return inst;
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
