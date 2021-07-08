package MainFrame;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AboutImage extends Component{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public AboutImage() {
		try{
			String path = "PaintLogoCsc.png";
		    File file = new File(path);
		    BufferedImage image = ImageIO.read(file);
		    JLabel label = new JLabel(new ImageIcon(image));
		    JFrame f = new JFrame();
		    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		    f.getContentPane().add(label);
		    f.pack();
		    f.setLocation(200,200);
		    f.setVisible(true);
		}
		catch(Exception ex){}
	} 
}
