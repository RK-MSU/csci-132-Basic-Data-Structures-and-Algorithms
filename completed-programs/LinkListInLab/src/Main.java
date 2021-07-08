import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean done = true;
		LinkList list = new LinkList();
		
		
		while(done)
		{
			 
			String inString;
			String inString1;
			System.out.println("What would you like to do?");
			System.out.println("Press 1 to add an item");
			System.out.println("Press 2 to print the list");
			System.out.println("Press 3 to search the list");
			System.out.println("Press 4 to delete an item");
			System.out.println("Press 5 to clear the whole list");
			System.out.println("Press -1 to exit");
			inString = in.next();
			
			if(inString.equals("1"))
			{
				 
				System.out.println("Student Name?");
				inString = in.next();
				System.out.println("Student ID Number? (Must be int)");
				inString1 = in.next();
				int num = Integer.parseInt(inString1);
				list.addNode(new Node(new Student(inString, num)));
				System.out.print("");
				 
				
				
			}
			if(inString.equals("2"))
			{	list.print();
				
				System.out.println("Please enter any value to continue");
				inString = in.next();}
			
			else if(inString.equals("3"))
			{
				System.out.println("Please Enter the name you would like to search (Exact Spelling)");
				
				inString = in.next();
				System.out.println("Please Enter the ID number you would like to search (Exact Spelling)");
				inString1 = in.next();
				int num = Integer.parseInt(inString1);
				list.search(inString,num);
				System.out.println("Please enter any value to continue");
				inString = in.next();
				
			}
			else if(inString.equals("4"))
			{
				list.print();
				System.out.println("Please type the name which you would like to delete (Exact Spelling)");
				inString = in.next();
				list.delete(inString);
				list.print();
			}
			else if(inString.equals("5"))
			{
				list = new LinkList();
			}
			else if(inString.equals("-1"))
			{
				 
				System.out.print("Program Over");
				done = false;
			}
			
		}

	}

}
