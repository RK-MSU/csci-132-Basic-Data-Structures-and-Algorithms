package MainFrame;
import javax.swing.UIManager;
import javax.swing.UIManager.*;
import javax.swing.UnsupportedLookAndFeelException;

import Button.ButtonPanel;
/**
 * @author Simon Buchan
 * @author River Kelly
**/
public class Driver {	
	public static void main(String[] args) {
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} 
		catch (Exception e) {}
	     	MyFrame.getInstance();	      
		}		
}
