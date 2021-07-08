package annotator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.*;

import javax.swing.*;

public class Interface implements ActionListener{
	
	
	
	
	Interface()
	{
		JFrame login = new JFrame("Login");
		login.setSize(400, 300);
		JPanel center = new JPanel();
		JTextField userName = new JTextField();
		JTextField password = new JTextField();
		JButton submit = new JButton("Submit");
		submit.addActionListener(this);
		
		center.add(userName);
		center.add(password);
		
	}
	
	private JPanel getSideBar()
	{
		JPanel temp = new JPanel();
		
		
		
		return temp;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

	
	
	
}
