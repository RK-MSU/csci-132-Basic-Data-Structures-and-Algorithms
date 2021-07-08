package MainFrame;
import Draw.MousePanel;
import MainFrame.AboutImage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
/**
 * @author Simon Buchan
 * @author River Kelly
**/
public class MainMenu extends JMenuBar implements ActionListener {
	/**
	 * 
	 */
	
	private static MainMenu inst;
	
	
    MainMenu(){
           JMenu file = new JMenu("File");
           JMenu edit = new JMenu("Edit");
           JMenu view = new JMenu("View");
           JMenu help = new JMenu("Help");        
           
           JMenuItem quit = new JMenuItem("Quit");          
           JMenuItem clr_all = new JMenuItem("Erase All");
           JMenuItem save = new JMenuItem("Save");
           JMenuItem about = new JMenuItem("About");
           
           quit.addActionListener(this);
           save.addActionListener(this);
           help.addActionListener(this);
           about.addActionListener(this);
           clr_all.addActionListener(this);
           
           file.add(quit); 
           file.add(save);
           edit.add(clr_all);
           help.add(about);
           
           add(file);
           add(edit);
           add(view);
           add(help);
           
           setVisible(true);           
    }
    
    public static MainMenu getInstance(){
        if(inst == null)
            inst = new MainMenu();
        return inst;
    }

    public void actionPerformed(ActionEvent evt){
        if(evt.getActionCommand() == "Erase All"){
            MousePanel.getInstance().clear();            
        }
        if(evt.getActionCommand() == "Quit"){
        	System.exit(0);
        }
        if(evt.getActionCommand() == "Save"){        	
        	
        }
        
        if(evt.getActionCommand() == "About"){
        	new AboutImage();
        }
    }
}