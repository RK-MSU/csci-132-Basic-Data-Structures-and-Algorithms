package Main;

import java.awt.GridLayout;
import java.io.IOException;
import java.util.Scanner;

import Frame.Window;
import LinkList.LinkList;
import LinkList.Node;
import LinkList.Person;
import WritingFilesOut.FileOut;



public class Driver {
	
	public static Scanner in = new Scanner(System.in);
	
	public static LinkList list = new LinkList();
	public static LinkList DELlist;
	private static String inString, inString1;
	private static int countME = 1;
	private static Window ME;
	private static int programNum = 1;
	
	public static void getMenu()
	{
		System.out.println("------------------");
		System.out.println("-1. exit");
		
		System.out.println("1. Print all Items");
		System.out.println("2. Clear all Items");
		System.out.println("3. Add People");
		System.out.println("4. Run Count Down");
		
		
	}

//Driver
	public static void main(String[] args) {
	
		
		//Local Instance Fields
		boolean done = true;
		while(done){
		
			
		//Print Menu
			getMenu();
			inString = in.next();
			
		
		//Selection  = -1 then Quit Program
			if(inString.equals("-1")){
				done = false;}
			
		//Print Names in link list
			else if(inString.equals("1")){
				list.print();
				
			}
			
		//Clear All Items
			else if(inString.equals("2"))
			{
				list = new LinkList();
			}
			
		//Add People to list
			else if(inString.equals("3"))
			{
				System.out.println("--------------");
				System.out.println("Type in 'ran' for a random number of people in circle between 1 and 100");
				System.out.println("Or type in an 'int' equal to the quantaty of people in the circle:");
				inString = in.next();
				if(inString.equals("ran"))
				{	int counter = 0,
						x = (int)(Math.random()*100);
					do{ 
						addMany();
						counter++;
						}while(counter < x);
					FileOut.add("---------------");
					FileOut.add(x + " people were added to the circle");
					
					System.out.println("There were "+x+" people added to the list");
				}
				else
				{
					int x = Integer.parseInt(inString),
							counter = 0;
					do{ addMany();
						counter++;
					}while(counter< x);
					System.out.println("There were "+x+" people added to the list");
					FileOut.add("---------------");
					FileOut.add(x + " people were added to the circle");
					
					
				}
			}
			
		//Count off selection
			else if(inString.equals("4"))
			{
				System.out.println("1. Import File for reading");
				System.out.println("2. Continue without import");
				inString = in.next();
				if(inString.equals("1"))
				{
					FileOut.readIn();
					list = new LinkList();
					int x = FileOut.getN();
					int counter = 0;
					do{ addMany();
						counter++;
					}while(counter< x);
					System.out.println("There were "+x+" people added to the list");
					FileOut.add("---------------");
					FileOut.add(x + " people were added to the circle");
					int k = FileOut.getK();
					int m = FileOut.getM();
					FileOut.add("----------------");
					FileOut.add("Round " + programNum);
					FileOut.add("----------------");
					FileOut.add("Number of People = " + list.getNumPeople() + ", K = " + k + ", M = "+ m);
					list.printItemsOut();
					
					run(list.first,list.last, k, m);
				
				}
				else{
				
				if(list.first == null)
				{
					System.out.println("---------------------------------------");
					System.out.println("There is no one in list, please try again");
					
				}
				else{
					int x, y;
					x = (int) (Math.random()*100);
					y = (int) (Math.random()*100);
					
					FileOut.add("----------------");
					FileOut.add("Round " + programNum);
					FileOut.add("----------------");
					FileOut.add("Number of People = " + list.getNumPeople() + ", K = " + x + ", M = "+ y);
					list.printItemsOut();
					
					run(list.first,list.last, x, y);
					
				}
				
			}
			}
				
		
	}
	}
	
	public static void addNode(String a){
		list.addNode(new Node(new Person(a)));
		
		}
	
	
	public static void addMany(){
		String name = "River" + countME++;
		addNode(name);
	}
	

	//recusive method for counting off
	public static void run(Node pick1, Node pick2, int x, int y){
		
		pick1 = list.rotateCW(pick1,x);
		pick2 = list.rotateCCW(pick2,y);
		
		
		if(pick1 == pick2){
			System.out.println(pick1.getName()+" Has been elected for president");
			FileOut.add("---------------");
			FileOut.add(pick1.getName()+" Has been elected for president");
			FileOut.add("---------------");
			FileOut.add("End of Round "+ programNum++ );
			list.delete(pick1);
		
			FileOut.writeOut();
			if(list.getNum() > 1){
				
				FileOut.add("----------------");
				FileOut.add("Round " + programNum);
				FileOut.add("----------------");
				FileOut.add("Number of People = " + list.getNumPeople() + ", K = " + x + ", M = "+ y);
				list.printItemsOut();
				run(list.first, list.first.getPre(), x, y);
			}
		}
		else if(pick1 != pick2){
			System.out.println(pick1.getName()+" and "+ pick2.getName()+ " have been sent of to get thier brains checked");
			FileOut.add("Sent to Get Brains Checked");
			FileOut.add(pick1.getName() + " and "+ pick2.getName());
			list.delete(pick1);
			list.delete(pick2);
			if(list.getNum() > 0)
			run(pick1.getNext(),pick2.getPre(), x, y);
			else
			{
				FileOut.add("---------------");
				FileOut.add("Everyone was sent to get brains looked at and");
				FileOut.add("No one has been elected for president");
				FileOut.add("---------------");
				FileOut.add("End of Round "+ programNum++ );
				
				FileOut.writeOut();
			}
		}
	
	}
	

	

	

	public static void setListInst(LinkList in2) {
		list =in2;
	}
	
}



