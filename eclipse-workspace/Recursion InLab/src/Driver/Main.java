package Driver;

import java.util.Scanner;

public class Main {
	
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		boolean done = true;
		while(done)
		{
			System.out.println("------------------------------");
			System.out.println("Check if Palindrome");
			System.out.println("Type in 'done' if complete");
			System.out.print("Enter your Palindrome:");
			String x = in.nextLine();
			System.out.println("------------------------------");
			if(x.equals("done"))
			{
				done = false;
			}
			else
			{
				boolean pal = Recursion.checkPalindrome(x);
				
				if(pal)
				{
					System.out.println("'"+x +"' IS a Palindrome");
				}
				else
				{
					System.out.println("'"+x + "' is NOT a Palindrome");
				}
			}
			
		} 
		
		done = true;
		while(done)
		{
			System.out.println("Check two numbers for there GCD  ");
			System.out.println("Please enter 'done' if complete");
			System.out.print("Please enter the first Number:");
			String inString = in.nextLine();

			if(inString.equals("done"))
			{
				done = false;
			}
			else
			{
				int x = Integer.parseInt(inString);
				System.out.print("Please enter the second Number:");
				inString = in.nextLine();
				System.out.println("------------------------------");
				int y = Integer.parseInt(inString);
				if(x >= y){
				System.out.println("The GCD of "+x+" and "+y+" is "+ Recursion.gcd(x,y));
				}
				else
				{
					System.out.println("The GCD of "+x+" and "+y+" is "+ Recursion.gcd(y,x));
				}
			}
			System.out.println("------------------------------");
		}
		System.out.println("GoodBye");
			
			
			
		}
	}
	


