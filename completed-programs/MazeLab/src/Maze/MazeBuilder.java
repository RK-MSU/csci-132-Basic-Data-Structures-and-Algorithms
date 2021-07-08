package Maze;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

public class MazeBuilder 
{
	private static Scanner in = new Scanner(System.in);
	private static String[][] newMaze;
	
	public MazeBuilder()
	{
		System.out.println("How many colums would you like your maze to be?");
		String inString = in.next();
		int x, y = Integer.valueOf(inString);
		System.out.println("How many rows would you like your maze to be?");
		inString = in.next();
		x = Integer.valueOf(inString);
		newMaze = new String[x][y*2];
		for(int row = 0; row < newMaze.length; row++)
		{
			for(int col = 0; col < newMaze[row].length; col++)
			{
				newMaze[row][col++] = ".";
				newMaze[row][col] = " ";
			}
		}
		
		
		print();
		build();
		
	}
	
	void print()
	{
		for( int row = 0; row < newMaze.length; row++)
		{
			for(int col = 0 ; col < newMaze[row].length; col++)
			{
				if(col == newMaze[row].length-1){
				System.out.println(newMaze[row][col]);
					}
				else{
					System.out.print(newMaze[row][col]);
					}
			}
		}
	}
	
	void build()
	{
		boolean done = true;
		while(done)
		{
		String inString = in.next();
				if(inString.equals("done"))
				{
					done = false;
				}
			
			
		}
	}

	
	
	
}
