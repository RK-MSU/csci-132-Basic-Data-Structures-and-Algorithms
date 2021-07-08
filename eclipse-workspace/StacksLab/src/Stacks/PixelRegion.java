package Stacks;

import java.util.EmptyStackException;
import java.util.Stack;

public class PixelRegion 
{
	private int myX, myY;
	private static int[] temp, black = {0,0,0, 200}, newBoarderColor;
	private static Stack<PixelRegion> checkedPixels = new Stack<>(), newBoarder = new Stack<>();
	private static int handX, handY, testX, testY, counter, upCounter;
	private static String direction;
	
	//An Array will all the value of the Picture
	private static int picture[][];
	
	
	
	
	//Constructor - Initialize X and Y
 	public PixelRegion(int x, int y)
	{
		myX = x;
		myY = y;
	}
 	
 	//Initialize picture = to array of pixels of picture
 	public static void setPicture(int[][] pic, int x, int y, int h, int w)
 	{

 		picture = pic;
 		
 		handX = x;
 		handY= y;
 		testX = handX - 1;
 		testY = handY;
 		temp = getPixelArray(picture[y][x]);
 		direction = "north";
 		counter = 0;
 		upCounter = 0;
 		checkedPixels.push(new PixelRegion(x,y));
 		
 		addToStack(); 
 	
 		
 	
 		
 		
 		
 		
 		
 	}
	
 	public static void solve()
 	{
 		System.out.println("----Loop----" );
 		while(checker()){
 			
 			addToStack();
 			
 			
 		if(direction == "north")
 		{
 			moveNorth();
 			upCounter++;
 			
 		}
 		else if(direction == "south")
 		{
 			moveSouth();
 		}
 		else if(direction == "east")
 		{
 			moveEast();
 		}
 		else if(direction == "west")
 		{
 			moveWest();
 		}
 		setToBlack();
 	}
 	
 	
 		setToBlack();
 		IMP.setNewPicture(picture);
 	}
 	
 	
 	
 	private static boolean checker()
 	{
 		if(upCounter > 100 && counter == 0)
 		{
 			return false;
 		}
 		else
 		{
 			if(upCounter> 50 && counter != 0)
 			{
 				upCounter = 0;
 				counter = 0;
 			}
 			return true;
 		}
 		
 		
 	}
 	
 	

	//this method will check if the test coordinates can keep moving North
	 private static boolean checkNorth()
	 	{	
		 	int[] handTest = getPixelArray(picture[handY -1][handX]);
		 	int[] testFront = getPixelArray(picture[testY -1][testX]);
		 	
		 	if(testFront[0] == 0 && testFront[1] == 0 && testFront[2] == 0)
		 	{
		 		direction = "west";
		 		return false;
		 	}
		 	if(handTest[0] == 0 &&
		 		handTest[1] == 0 &&
				handTest[2] == 0)
		 	{
		 		return true;
		 	}
		 	else
		 	{
		 		return false;
		 	}
				
	 	}

	 	
	 //this method checks if the test coordinates can keep moving east
	 private static boolean checkEast()
	 	{
		 	int[] handTest = getPixelArray(picture[handY][handX+1]);
		 	int[] testFront = getPixelArray(picture[testY][testX+1]);
		 	if(testFront[0] == 0 && testFront[1] == 0 && testFront[2] == 0)
		 	{
		 		direction = "north";
		 		return false;
		 	}
		 	if(handTest[0] == 0 &&
		 		handTest[1] == 0 &&
				handTest[2] == 0)
		 	{
		 		return true;
		 	}
		 	else
		 	{
		 		return false;
		 	}
		
	 	}

	 //this method will return true if the test coordinates can keep moving south
	private static boolean checkSouth()
	 	{
	 	int[] handTest = getPixelArray(picture[handY+1][handX]);
	 	int[] testFront = getPixelArray(picture[testY+1][testX]);
	 	if(testFront[0] == 0 && testFront[1] == 0 && testFront[2] == 0)
	 	{
	 		direction = "east";
	 		return false;
	 	}
	 	if(handTest[0] == 0 &&
	 		handTest[1] == 0 &&
			handTest[2] == 0)
	 	{
	 		return true;
	 	}
	 	else
	 	{
	 		return false;
	 	}
	 	}
	 	
	 //this method will return true if the test coordinates can keep moving west
	 private static boolean checkWest()
	 	{
		 try{
			 int[] handTest = getPixelArray(picture[handY][handX-1]);
			 int[] testFront = getPixelArray(picture[testY][testX-1]);
			 if(testFront[0] == 0 && testFront[1] == 0 && testFront[2] == 0)
			 	{
			 		direction = "south";
			 		return false;
			 	}
			 if(handTest[0] == 0 &&
		 		handTest[1] == 0 &&
				handTest[2] == 0)
		 	{
		 		return true;
		 	}
		 	else
		 	{
		 		return false;
		 	}
		 }catch(ArrayIndexOutOfBoundsException e)
		 {
			 return false;
		 }
	 	}
	 	

 	 //this method will move North
	 private static void moveNorth()
	 {	
		 
		 
		while(checkNorth())
		{
			
			testY -= 1;
			handY -= 1;
			addToStack();
		}
		
		if(direction == "west")
		{
			
			handY = testY -1;
			handX = testX;
			addToStack();
			System.out.println("Changed");
		}
		else{
		handY = testY;
		handX = testX;
		testY = handY -1;
		direction = "east";
		addToStack();
		}
		
		
		 
	 }
	 
	 //this method will move east
	 private static void moveEast()
	 {		
		 
		 while(checkEast())
			{
				
				testX += 1;
				handX += 1;
				addToStack();
			}
		
			if(direction == "north")
			{
				direction = "north";
				handX = testX+1;
				handY = testY;
				addToStack();
				System.out.println("Changed");
			}
			else{
			handY = testY;
			handX = testX;
			testX = handX +1;
			direction = "south";
			addToStack();
			}
			
		
	 }
	 
	 //this method will move south
	 private static void moveSouth()
	 {	
		 
		 while(checkSouth())
			{
				
				testY += 1;
				handY += 1;
				addToStack();
			}
		 
		 if(direction == "east")
			{
				direction = "east";
				handX = testX;
				handY = testY+1;
				addToStack();
				System.out.println("Changed");
			}
			else{
			handY = testY;
			handX = testX;
			testY = handY +1;
			direction = "west";
			addToStack();
			}
			
		
	 }
	 
	 //this method will move west
	 private static void moveWest()
	 {
		
		 while(checkWest())
			{
				
				testX -= 1;
				handX -= 1;
				addToStack();
			}
		 
		 if(direction == "south")
			{
				direction = "south";
				handX = testX -1;
				handY = testY;
				addToStack();
				System.out.println("Changed");
			}
			else{
			
			handY = testY;
			handX = testX;
			testX = handX -1;
			direction = "north";
			addToStack();
			}
	 }
	 
	 
 	
 	
 	
 	
 	
	//This method will change all pixels in stack to black
	private static void setToBlack()
	{	
	
		while(!checkedPixels.empty()){
		int x = checkedPixels.peek().myX, y = checkedPixels.peek().myY;
		picture[y][x] = getPixels(black);
		checkedPixels.pop();
		counter++;
			}
		
		
	}
	//this will add the pixel to the stack
 	
	private static void addToStack()
 	{	
		
		if(testThreshold()){
 		checkedPixels.push(new PixelRegion(testX,testY));
		}
 	}
 	
 	/*
     * This method takes a single integer 
     * value and breaks it down doing bit manipulation 
     * to 4 individual int values for A, R, G, and B values
     */
  private static int [] getPixelArray(int pixel)
  {
      int temp[] = new int[4];
      temp[0] = (pixel >> 24) & 0xff;
      temp[1]   = (pixel >> 16) & 0xff;
      temp[2] = (pixel >>  8) & 0xff;
      temp[3]  = (pixel      ) & 0xff;
      return temp;
      
    }
    /*
     * This method takes an array of size 4 
     * and combines the first 8 bits of each to create one integer. 
     */
  private static int getPixels(int rgb[])
  {
         int rgba = (rgb[0] << 24) | (rgb[1] <<16) | (rgb[2] << 8) | rgb[3];
        return rgba;
  }
  
//this method will return true if withing the threshold
  private static boolean testThreshold()
  {
	  int[] testTemp = getPixelArray(picture[testY][testX]);
	  if(temp[0]+40 > testTemp[0] && temp[0]-40 < testTemp[0]&&
			  temp[1]+40 > testTemp[1] && temp[1]-40 < testTemp[1]&&
			  temp[2]+40 > testTemp[2] && temp[2]-40 < testTemp[2]){
		  return true;
	  }
	  else{
		  return false;
		  
		  
	  }
  }
	
	 //this method will add a new item to the newBoarder stack
	 private static void addNewBoarder(int[] newColor)
	 {
		 newBoarder.push(new PixelRegion(handX, handY));
		 newBoarder.push(new PixelRegion(testX, testY));
		 newBoarderColor = newColor;
	 }
	 
	 //this method will set the test coordinates and the righ hand to the newboard
	 private static void setNewBoarder()
	 {
		 handX = newBoarder.peek().myX;
		 handY = newBoarder.peek().myY;
		 newBoarder.pop();
		 testX = newBoarder.peek().myX;
		 testY = newBoarder.peek().myY;
		 newBoarder.pop();
		 
	 }
	 
		 
}