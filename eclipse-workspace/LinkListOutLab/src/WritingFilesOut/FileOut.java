package WritingFilesOut;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.FileReader;



public class FileOut {
	
		

		private static ArrayList<String> info = new ArrayList<String>();
		private static ArrayList<String> doc = new ArrayList<String>();
		private static ArrayList<String> readIn = new ArrayList<String>();
		private static ArrayList<Integer> nums = new ArrayList<Integer>();
	
	public static void add(String a)
	{
		info.add(a);
	}
	
	public static void clear()
	{
		info = new ArrayList<String>();
	}
	
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
			            doc.add(thisLine);
			         }
			      }catch(FileNotFoundException e){
				        System.out.println("Please enter a correct file name,"+ inString+" was not found");
				        readIn();
				      
			      }catch(Exception e){
			         e.printStackTrace();
			      }
		convert(doc.get(0));
		for(int i = 0, count = 0; count < 3; i++)
		{
			nums.add(Integer.parseInt(readIn.get(i)));
			count++;
				
			}
			
		}
	
	private static void convert(String a)
	{
		String get;
		if(a.contains(" ")){
		get = a.substring(0, a.indexOf(" "));
		a = a.substring(a.indexOf(" ")+1, a.length());
		}
		else
			get = a;
	
		
		
		readIn.add(get);
		
		if(readIn.size() < 3)
		{
			convert(a);
		}
			
	}
	
	public static int getN()
	{
		return nums.get(0);
	}
	public static int getK()
	{
		return nums.get(1);
	}
	public static int getM()
	{
		return nums.get(2);
	}
	
	
	
	public static void writeOut(){
   

    try{
    	    
    	    PrintWriter printWriter = new PrintWriter("LinkListProgram.txt");
    	   
    	    for(int i = 0; info.size() > i; i++)
    		{
    			printWriter.println(info.get(i));
    		}
    	    printWriter.close ();
        
    } catch( IOException e) {
        e.printStackTrace();
    }
 }


}