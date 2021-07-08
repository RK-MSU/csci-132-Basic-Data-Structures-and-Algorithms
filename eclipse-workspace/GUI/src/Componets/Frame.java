package Componets;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame{

	public Frame()
	{
		
		JFrame window = new JFrame("Edit your Board");
		window.setSize(300, 300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel left = ButtonPanel.getInst();
		window.add(left, BorderLayout.WEST);
		
		
		
		
		
		window.setVisible(true);
	}
}
