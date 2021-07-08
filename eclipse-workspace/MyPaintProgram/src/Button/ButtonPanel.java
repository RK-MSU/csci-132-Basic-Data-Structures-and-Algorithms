package Button;
import Draw.MousePanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
/**
 * @author Simon Buchan
 * @author River Kelly
**/
public class ButtonPanel extends JPanel implements ActionListener, ChangeListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static ButtonPanel inst;
    private JButton eOvalButton, fOvalButton, eRectangleButton, fRectangleButton, lineButton, clearButton, freeDraw;
    public JSlider strokeSlider, redSlider, blueSlider, greenSlider; 
    private String path;
    private File file;
    private BufferedImage image;
    private ImageIcon icon;
    private Image scaleImage;
   
    ButtonPanel(){
    	try{
    	  path =  "EmptyCircle.png";
    	  file = new File(path);
    	  image = ImageIO.read(file);
    	  icon = new ImageIcon(image);
    	  scaleImage = icon.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
		  icon = new ImageIcon(scaleImage);
    	  eOvalButton = new JButton(icon);
	      eOvalButton.addActionListener(this);
	      
	      path = "FilledCircle.png";
		  file = new File(path);
		  image = ImageIO.read(file);
		  icon = new ImageIcon(image);
		  scaleImage = icon.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
	      icon = new ImageIcon(scaleImage);
		  fOvalButton = new JButton(icon);	      
	      fOvalButton.addActionListener(this);
	      
	      path = "EmptyRectangle.png";
		  file = new File(path);
		  image = ImageIO.read(file);
		  icon = new ImageIcon(image);
		  scaleImage = icon.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
	      icon = new ImageIcon(scaleImage);
	      eRectangleButton = new JButton(icon);
	      eRectangleButton.addActionListener(this);
	      
	      path = "FilledRectangle.png";
		  file = new File(path);
		  image = ImageIO.read(file);
		  icon = new ImageIcon(image);
		  scaleImage = icon.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
	      icon = new ImageIcon(scaleImage);
	      fRectangleButton = new JButton(icon);
	      fRectangleButton.addActionListener(this);
	      
	      path = "Line.png";
		  file = new File(path);
		  image = ImageIO.read(file);
		  icon = new ImageIcon(image);
		  scaleImage = icon.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
	      icon = new ImageIcon(scaleImage);
	      lineButton = new JButton(icon);
	      lineButton.addActionListener(this);
	      
	      clearButton = new JButton("clear");
	      clearButton.addActionListener(this);
	      
	      freeDraw = new JButton("Free Draw");
	      freeDraw.addActionListener(this);
	      
	      strokeSlider = new JSlider(JSlider.HORIZONTAL, 0, 35, 25);
	      strokeSlider.setMinorTickSpacing(2);
	      strokeSlider.setMajorTickSpacing(10);
	      strokeSlider.setPaintTicks(true);
	      strokeSlider.setPaintLabels(true);
	      strokeSlider.addChangeListener(this);
	      JLabel strokeLabel = new JLabel("Stroke Size");
	
	      blueSlider = new JSlider(JSlider.HORIZONTAL, 1, 255, 1);
	      blueSlider.addChangeListener(this);
	      JLabel blueLabel = new JLabel("Blue");	     
	      
	      redSlider = new JSlider(JSlider.HORIZONTAL, 1, 255, 1);	  
	      redSlider.addChangeListener(this);
	      JLabel redLabel = new JLabel("Red");
	      
	      
	      greenSlider = new JSlider(JSlider.HORIZONTAL, 1, 255, 1);
	      greenSlider.addChangeListener(this);
	      JLabel greenLabel = new JLabel("Green");
	      
	     
	      
	      	      
	      add(eOvalButton);
	      add(fOvalButton);
	      add(eRectangleButton);
	      add(fRectangleButton);
	      add(lineButton);
	      add(freeDraw);
	      add(clearButton);
	      //add(new JSeparator());
	      add(strokeLabel);
	      add(strokeSlider);	      
	     // add(new JSeparator());
	      add(blueLabel);
	      add(blueSlider);
	      //add(new JSeparator());
	      add(redLabel);
	      add(redSlider);
	      //add(new JSeparator());
	      add(greenLabel);
	      add(greenSlider);
	      //add(new JSeparator());
	      
	      
	      setLayout(new GridLayout(15, 0, 10, 10));
    	}

    		catch (IOException e){
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		
    	}
		
	  }
    	
	  
	  public static ButtonPanel getInstance(){
	        if(inst == null)
	           inst =  new ButtonPanel();
	        return inst;
	   }
	  
	  public void actionPerformed(ActionEvent evt){	         
	         if (evt.getSource() == fRectangleButton){
	        	 MousePanel.getInstance().setShape(1);
	         }
	         if(evt.getSource() == eRectangleButton){
	        	 MousePanel.getInstance().setShape(2);
	         }
	         if(evt.getSource() == fOvalButton){
	        	 MousePanel.getInstance().setShape(3);
	         }
	         if(evt.getSource() == eOvalButton){
	        	 MousePanel.getInstance().setShape(4);
	         }
	         if(evt.getSource() == lineButton){
	        	 MousePanel.getInstance().setShape(5);
	         }
	         if(evt.getSource() == clearButton){
	        	 MousePanel.getInstance().clear();
	         }
	         if(evt.getSource() == freeDraw){
	        	 MousePanel.getInstance().setShape(6);
	         }
	  }
	  
	  @Override
	  public void stateChanged(ChangeEvent evt) {
			// TODO Auto-generated method stub
			if(strokeSlider == evt.getSource()){
				MousePanel.getInstance().setStroke(strokeSlider.getValue());
			}
			Color myColor = new Color(redSlider.getValue(),greenSlider.getValue(),blueSlider.getValue());
			if(blueSlider == evt.getSource()){
				MousePanel.getInstance().setColor(myColor);
			}
			if(redSlider == evt.getSource()){
				MousePanel.getInstance().setColor(myColor);
			}
			if(greenSlider == evt.getSource()){
				MousePanel.getInstance().setColor(myColor);
			}
	  }		  	  
}
