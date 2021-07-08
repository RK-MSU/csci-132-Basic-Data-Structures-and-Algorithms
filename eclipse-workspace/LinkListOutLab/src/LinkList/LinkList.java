package LinkList;

import java.io.Serializable;

import Frame.Menu;
import Main.Driver;
import WritingFilesOut.FileOut;

public class LinkList implements Serializable {
	
	public LinkList inst = this;

	
	
	public static Node first, last;
	
	
	
//Constructor for LinkList
	public LinkList() {
		first = null;
		
		}
	

	
//Adding a new Node in the Link List
	public void addNode(Node input)
	{
		if(first == null){
			first = input;
			last = first;
			first.setNext(last);
			first.setPre(last);
			last.setNext(first);
			last.setPre(first);
			}
		else {
			Node PRE = last;
			last.setNext(input);
			last = last.getNext();
			last.setNext(first);
			first.setPre(last);
			last.setPre(PRE);
		}
	}
	
//Print all Name
	public void print()
	{	
		if(first == null)
		{
			System.out.println("----------------");
			System.out.println("No one in List");
			
		}
		else{
		Node a = first;
		int counter = 1;
		do{
			System.out.println(counter++ +". "+ a.getName());
			a = a.getNext();
			
		}while(a != first);
		}
		
		
	}

	
	
//Rotate Clock Wise (to next)
	public static Node rotateCW(Node start, int limit){
		int count = 0;
		Node out;
		do{
			out = start;
			start = start.getNext();
			count++;
		
		}while( count++ <= limit);
	
		return out;
	}

//Rotate Counter Clock Wise (to pre)
	public static Node rotateCCW(Node start, int limit){
		int count = 0;
		Node out;
		
		do{
			out = start;
			start = start.getPre();
			count++;
			
		}while(count++ <= limit);
		
			return out;
	}
	
	
//Delete a node form the list
	public void delete(Node delNode)
	{ 
		if(getNum() <= 1)
		{
			Driver.list = new LinkList();
		}
		else{
		if(delNode == first && first.getNext() != first)
		{
			first = first.getNext();
			first.setPre(last);
			last.setNext(first);
		}
		else if(delNode == last)
		{
			Node Pre = last.getPre();
			Pre.setNext(first);
			last = Pre;
			first.setPre(last);
		}
		
		
		else
		{
			Node PRE,NEXT;
			PRE = delNode.getPre();
			NEXT = delNode.getNext();
			PRE.setNext(NEXT);
			NEXT.setPre(PRE);
			
		}
		}
	}
	
	
	public Node search(String search) {
		Node a = first;
		Node out = null;
		
		do{
			if(a.getName().equals(search))
			{
				out = a;
				
			}
			
				a = a.getNext();
			
			
		}while(a != first);
		return out;

	}
	
	
	
	


		



			public void printItemsOut() {
				if(first == null)
				{
					FileOut.add("----------------");
					FileOut.add("No one in List");
					
				}
				else{
				Node a = first;
				int counter = 1;
				FileOut.add("-------------");
				FileOut.add("People in the circle are:");
				do{
					FileOut.add(counter++ +". "+ a.getName());
					a = a.getNext();
					
				}while(a != first);
				FileOut.add("-------------");
				}
				
			}
			
			public static int getNum()
			{
				if(first == null)
				{
					return 0;
					
				}
				else{
				Node a = first;
				int counter = 0;
				do{
					
					a = a.getNext();
					counter++;
					
				}while(a != first);
				
				return counter;
				}
				
			}
			
			
			public static String getNumPeople()
			{
				if(first == null)
				{
					return "0";
					
				}
				else{
				Node a = first;
				int counter = 0;
				do{
					
					a = a.getNext();
					counter++;
					
				}while(a != first);
				String out = String.valueOf(counter);
				return out;
				}
				
			}
			
			
}


