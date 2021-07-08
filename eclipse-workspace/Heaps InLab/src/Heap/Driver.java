package Heap;

import java.util.*;


public class Driver {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean done= true;
		String inString;
		
		do
		{
			menu();
			inString = in.next();
			
			//Quit
			if(inString.equals("0"))
			{
				done = false;
				System.out.println("GOOD BYE");
			}
			//Add Single
			else if(inString.equals("1"))
			{
				int add = 1;
				try{
				System.out.println("Please input the Integer you would like to add to the Heap");
				add = in.nextInt();
				Heap.addInt(add);
				}catch(InputMismatchException e)
				{
					System.out.println(add + " is not an Integer, please try again");
				}
				
			}
			
			//Print
			else if(inString.equals("2"))
			{
				if(Heap.heap.size() > 0)
				{
				Heap.print();
				}
				else
				{
					System.out.println("--------------------------");
					System.out.println("There are no items in heap");
					
				}
			}
			//Delete
			else if(inString.equals("3"))
			{
			Heap.delete();	
			
			}
			else if(inString.equals("4"))
			{
				Heap.addInt(15);
				Heap.addInt(5);
				Heap.addInt(8);
				Heap.addInt(4);
				Heap.addInt(9);
				Heap.addInt(22);
				Heap.addInt(17);
				Heap.addInt(6);
				Heap.addInt(14);
				
			}
			
			
		}while(done);

	}
	
	private static void menu()
	{
		System.out.println("--------");
		System.out.println("0. Quit");
		System.out.println("1. Add");
		
		System.out.println("2. Print");
		
		System.out.println("3. Delete");
		System.out.println("4. Add Many");
		
		System.out.println("--------");
	}

}
