package External;

import java.io.*;
import java.nio.*;
import java.util.*;

import Maze.Table;


public class ReadFile {
	
	private static ArrayList<String> intable = new ArrayList<String>();
	
	public static void readIn()
	{
		String  thisLine = null;
		Scanner read = new Scanner(System.in);
		System.out.println("Please type the file name you would like to import.");
		System.out.println("Example 'readme.txt'");
		String inString = read.next();
		
			      try{
			         // open input stream test.txt for reading purpose.
			    	  FileReader in = new FileReader(inString);
			         BufferedReader br = new BufferedReader(in);
			         while ((thisLine = br.readLine()) != null) {
			            intable.add(thisLine);
			         }
			
			
			      }catch(FileNotFoundException e){
			    	  	System.out.println("Please enter a correct file name,"+ inString+" was not found");
			    	  	readIn();
			
			      }catch(Exception e){
			    	  e.printStackTrace();
			      }
		setTable();
		addLines();
	}
	
	private static void setTable()
	{
		new Table(intable);
	}
	private static void addLines()
	{
		int lineCounter=0;
		do{
			Table.add(intable.get(lineCounter));
		}while( ++lineCounter < intable.size());
		
		
		
	}

}
