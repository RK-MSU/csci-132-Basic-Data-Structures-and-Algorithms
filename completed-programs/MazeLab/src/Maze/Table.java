package Maze;

import java.util.ArrayList;

import javax.security.auth.login.AccountNotFoundException;
/**
 * @author RK3lly
 *
 */
public class Table {
	public static String[][] maze;
	private static int mazeRow , mazeCol;
	public static int ROW, COL;
	private static Table inst = null;
	private static int corner = 0;
	
	
//Creating the size of the Maze	
	public Table(ArrayList<String> a)
	{
		mazeRow = 0;
		mazeCol = 0;
		int x = a.size();
		int y = a.get(0).length();
		maze = new String[x][y];
		
		inst = this;
	}

//Adding characters in line by line
	public static void add(String line)
	{
		String letter;
		
		while(line.length() >= 1){
			
			
			letter = String.valueOf(line.charAt(0));
			if(letter.equals("S"))
			{
				ROW = mazeRow;
				COL = mazeCol;
			}
			maze[mazeRow][mazeCol++] = letter;
			
			line = line.substring(1);
			}
		
		mazeRow++;
		mazeCol = 0;
		
		
	}
//Print table
	public static void print()
	{
		for( int row = 0; row < maze.length; row++)
		{
			for(int col = 0 ; col < maze[row].length; col++)
			{
				if(col == maze[row].length-1){
				System.out.println(maze[row][col]);
					}
				else{
					System.out.print(maze[row][col]);
					}
			}
		}
	}
	
//Recursive Method For Solving Maze
	public static void solve()
	{
		if(finished())
		{
			System.out.println("Maze has been completed" );
		}
		else{
			if(checkCorner())
			{
			setCorner();
			solve();
			}
			
			else if(checkSouth())
			{
			moveSouth();
			solve();
			}
			else if(checkEast())
			{
			moveEast();
			solve();
			}
			else if(checkWest())
			{
			moveWest();
			solve();
			}
			else if(checkNorth())
			{
			moveNorth();
			solve();
			}
			else{ 
			toLastCorner();
			solve();
			}
		}
		
	}
	
//To last Corner
	public static void toLastCorner()
	{	
		for( int row = 0; row < maze.length; row++)
		{
			for(int col = 0 ; col < maze[row].length; col++)
			{
				if(maze[row][col].equals(String.valueOf(corner-1)))
				{
					maze[ROW][COL] = "X";
					ROW = row;
					COL = col;
					maze[row][col] = "S";
				}
			}
		}
		corner -=1;
	}
	
//Method to set a corner
	public static void setCorner()
	{
		maze[ROW][COL] = String.valueOf(corner++);
		
		if(checkSouth())
		{
			ROW += 1;
		}
		else if(checkEast())
		{
			COL -= 2;
		}
		else if(checkWest())
		{
			COL += 2;
		}
		else if(checkNorth())
		{
			ROW -= 1;
			
		}
	}
	
//Check North position
	public static boolean checkNorth()
		{
			if(maze[ROW-1][COL].equals("#")|| 
					maze[ROW-1][COL].equals("X")||
					maze[ROW-1][COL].equals("0")||
					maze[ROW-1][COL].equals("1")||
					maze[ROW-1][COL].equals("2")||
					maze[ROW-1][COL].equals("3"))
			{
				return false;
			}
			else
			{
				return true;
			}
		}
	
//check South
	public static boolean checkSouth()
	{
		if(maze[ROW+1][COL].equals("#")||
				maze[ROW+1][COL].equals("X")||
				maze[ROW+1][COL].equals("0")||
				maze[ROW+1][COL].equals("1")||
				maze[ROW+1][COL].equals("2")||
				maze[ROW+1][COL].equals("3"))
		{
			return false;
		}
		else
		{
			return true;
		}
			
	}

//Check West
	public static boolean checkWest()
{
		try{
		if(maze[ROW][COL+2].equals("#")|| 
				maze[ROW][COL+2].equals("X")||
				maze[ROW][COL+2].equals("0")||
				maze[ROW][COL+2].equals("1")||
				maze[ROW][COL+2].equals("2")||
				maze[ROW][COL+2].equals("3"))
		{
			return false;
		}
		else
		{
			return true;
		}
		}catch(ArrayIndexOutOfBoundsException e){
			return false;
		}
}

//check East
	public static boolean checkEast()
{
	try{
		if(maze[ROW][COL-2].equals("#")||
				maze[ROW][COL-2].equals("X")||
				maze[ROW][COL-2].equals("0")||
				maze[ROW][COL-2].equals("1")||
				maze[ROW][COL-2].equals("2")||
				maze[ROW][COL-2].equals("3"))
		{
			return false;
		}
		else
		{
			return true;
		}
		}catch(ArrayIndexOutOfBoundsException e){
			return false;
		}
}

//Check to see if there is one or more options
	public static boolean checkCorner()
{
	int count = 0;
	if(checkNorth())
	{
		count++;
	}
	if(checkWest())
	{
		count++;
	}
	if(checkEast())
	{
		count++;
	}
	if(checkSouth())
	{
		count++;
	}
	if(count >= 2)
	{
		return true;
	}
	else
	{
		return false;
	}
}

//This method will move the piece North
	private static void moveNorth()
{
		maze[ROW][COL] = "X";
		ROW -= 1;
		if(maze[ROW][COL].equals("F"))
		{
			
			System.out.println("Maze has been solved");
		}else{
		maze[ROW][COL] = "S";
		 }
		
}
//This method will move the piece West
	private static void moveWest()
{
	
	
		maze[ROW][COL] = "X";
		COL +=2;
		if(maze[ROW][COL].equals("F"))
		{
			System.out.println("Maze has been solved");
		}else{
		maze[ROW][COL] = "S";
		 
		}
	
	
}

//This method will move the piece East
	private static void moveEast()
{
	maze[ROW][COL] = "X";
	COL -=2;
	if(maze[ROW][COL].equals("F"))
	{
		
		System.out.println("Maze has been solved");
	}else{
	maze[ROW][COL] = "S";
	 
	}
}

//This method will move the piece South
	private static void moveSouth()
{
	
	maze[ROW][COL] = "X";
	ROW += 1;
	if(maze[ROW][COL].equals("F"))
	{
		
		System.out.println("Maze has been solved");
	}else{
	maze[ROW][COL] = "S";
	 
	}
}

//Method to check is finished
	private static boolean finished()
	{
		try{
		if(maze[ROW-1][COL].equals("F") ||
				maze[ROW+1][COL].equals("F")||
				maze[ROW][COL+2].equals("F")||
				maze[ROW][COL-2].equals("F")
				)
		{
			return true;
		}
		else
			return false;
		}catch(ArrayIndexOutOfBoundsException e){ 
			return false;
		}
	}
}
		
		
	

