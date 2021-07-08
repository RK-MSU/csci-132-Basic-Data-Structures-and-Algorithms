package Frame;

import java.awt.GridLayout;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;

import LinkList.LinkList;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Menu extends JPanel implements ActionListener, ChangeListener,Driver {

	public static Menu inst;
	private JButton clear, add, print, set;
	private JSlider num;
	private static LinkList now;
	
	
	Menu(){
		
		

		
		clear = new JButton("Clear");
		clear.addActionListener(this);
		add(clear);
		
		add = new JButton("Add");
		add	.addActionListener(this);
		add(add);
		
		print = new JButton("print");
		print.addActionListener(this);
		add(print);
		
		set = new JButton("delete");
		set.addActionListener(this);
		add(set);
		setLayout(new GridLayout(15, 0, 10, 10));
	
	}
	
//Get new Inst
	public static Menu getInstance(){
        if(inst == null)
           inst =  new Menu();
        return inst;
   }

	@Override
	public void stateChanged(ChangeEvent e) {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == add)
		{
			Main.Driver.addMany();
		}
		else if(e.getSource() == set)
		{
			Main.Driver.list.delete(LinkList.first);
		}
		
	}

	@Override
	public Connection connect(String url, Properties info) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean acceptsURL(String url) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getMajorVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMinorVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean jdbcCompliant() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}
}


