

import java.util.*;

import External.ReadFile;
import Maze.MazeBuilder;
import Maze.Table;

public class Driver {

	private static Scanner in = new Scanner(System.in);
	private static String inString;
	
	
	public static void main(String [] args)
	{
		boolean done = true;
		while(done){
			System.out.println("0. Quit");
			System.out.println("1. Get Maze");
			System.out.println("2. Solve");
			
			
			
			inString = in.next();
			
			//Quit
			if(inString.equals("0"))
			{
				done = false;
			}
			else if(inString.equals("1"))
			{
				
				ReadFile.readIn();
				Table.print();
			}
			else if(inString.equals("2"))
			{
				try{
				Table.solve();
				Table.print();	
				}catch(NullPointerException e)
				{
					System.out.println("You have not loaded a maze");
				}
			}
			else if(inString.equals("3"))
			{
				new MazeBuilder();	
				
			}
			
		}
	}
}
