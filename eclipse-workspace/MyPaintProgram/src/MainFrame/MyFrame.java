package MainFrame;
import MainFrame.MainMenu;
import Button.ButtonPanel;
import Draw.MousePanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.UIManager;
/**
 * @author Simon Buchan
 * @author River Kelly
**/
public class MyFrame extends JFrame {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static MyFrame inst;
	
	MyFrame(){		
		super("Paint Program");
        setSize(1000, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        Container c = getContentPane();
        setBackground(Color.WHITE);
        c.add(ButtonPanel.getInstance(), BorderLayout.WEST);
        c.add(MousePanel.getInstance(), BorderLayout.CENTER);
        c.add(MainMenu.getInstance(), BorderLayout.NORTH);
        setLocationRelativeTo(null);
        setVisible(true);       
    }
    
    public static MyFrame getInstance(){
        if(inst == null)
           inst = new MyFrame(); 
         return inst;
    }
}
