package Heap;

/*
 *  @author River Kelly
 *  Basic Data Structures and Algorithms
 *  
 */

import java.util.ArrayList;

public class Heap
{
	public static ArrayList<Integer> heap = new ArrayList<Integer>();
	
	
	//Add new Item to heap
	public static void addInt(int input)
	{
		heap.add(input);
		sortNewItem(heap.size()-1);
	}
	
	
	//print all items in heap
		public static void print()
		{
			int index = 0;
			do{
				System.out.println(index+1+". "+ heap.get(index++));
			
			}while(heap.size() > index);
			System.out.println();
			
		}

 	//Sort a new Item in the Array from the end
	private static void sortNewItem(int index)
	{
		if(heap.get(index) > heap.get(getParent(index)))
		{
			int child = heap.get(index), parent = heap.get(getParent(index));
			heap.set(index, parent);
			heap.set(getParent(index), child);
			index = getParent(index);
			sortNewItem(index);
		}
		
	}
	
	
	//Delete Item from top of heap
	public static void delete()
	{
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		sortNewParent(0);
		
	}

	//sort a new item from the beginning of the array(or top of tree)
	public static void sortNewParent(int index) 
	{
		try{
		if(heap.get(checkLeft(index)) > heap.get(index))
		{
			int parent = heap.get(index), child = heap.get(checkLeft(index));
			heap.set(index, child);
			heap.set(checkLeft(index), parent);
			index = checkLeft(index);
			sortNewParent(index);
			
			
		}
		else if(heap.get(checkRight(index)) > heap.get(index))
		{
			int parent = heap.get(index), child = heap.get(checkRight(index));
			heap.set(index, child);
			heap.set(checkRight(index), parent);
			index = checkRight(index);
			sortNewParent(index);
		}
		}catch(IndexOutOfBoundsException e)
		{
			
		}
		
		
	}
	
	//Receive index and returns parent
	private static int getParent(int index)
		{
			return ((index-1)/2);
		}
		
	//return left value
	private static int checkLeft(int index)
	{
		return ((2*(index)) + 1);
	} 
	
	//return right value
	private static int checkRight(int index)
		{
			return ((2*(index)) + 2);
		}


}
