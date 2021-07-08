import java.util.Scanner;

public class Driver {
	
	
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		Sort.set();
		boolean done = true;
		String inString1;
		double startTime, finishTime;
		while(done)
			
		{	System.out.println("0. New set of Numbers");
			System.out.println("1. Print all Items in List");
			System.out.println("2. Bubble Sort");
			System.out.println("3. Insertion Sort");
			System.out.println("4. Exit Program");
			inString1 = in.nextLine();
			if(inString1.equals("1"))
			{
				Sort.printAll();
			}
			if(inString1.equals("2"))
				
			{	//sort array a with 20 items
				startTime = System.currentTimeMillis();
				Sort.bubbleSortA();
				finishTime = System.currentTimeMillis();
				System.out.println("The time in milliseconds to bubble sort "
						+ "20 items is " + (finishTime - startTime));
				
				
				//Sort array b with 100 items
				startTime = System.currentTimeMillis();
				Sort.bubbleSortB();
				finishTime = System.currentTimeMillis();
				System.out.println("The time in milliseconds to bubble sort "
						+ "100 items is " + (finishTime - startTime));
				
				
				//Sort array c with 500 items
				startTime = System.currentTimeMillis();
				Sort.bubbleSortC();
				finishTime = System.currentTimeMillis();
				System.out.println("The time in milliseconds to bubble sort "
						+ "500 items is " + (finishTime - startTime));
				
				
				//Sort array d with 1000 items
				startTime = System.currentTimeMillis();
				Sort.bubbleSortD();
				finishTime = System.currentTimeMillis();
				System.out.println("The time in milliseconds to bubble sort "
						+ "1000 items is " + (finishTime - startTime));
				
				
				
				//Sort array e with 10000 items
				startTime = System.currentTimeMillis();
				Sort.bubbleSortE();
				finishTime = System.currentTimeMillis();
				System.out.println("The time in milliseconds to bubble sort "
						+ "10000 items is " + (finishTime - startTime));
				
				
				
				
			}
			if(inString1.equals("3"))
			{
				startTime = System.currentTimeMillis();
				Sort.a = Sort.insertionSort(Sort.a);
				finishTime = System.currentTimeMillis();
				System.out.println("The time in milliseconds to insertion sort "
						+ "20 items is " + (finishTime - startTime));
				
				
				startTime = System.currentTimeMillis();
				Sort.b = Sort.insertionSort(Sort.b);
				finishTime = System.currentTimeMillis();
				System.out.println("The time in milliseconds to insertion sort "
						+ "100 items is " + (finishTime - startTime));
				
				startTime = System.currentTimeMillis();
				Sort.c = Sort.insertionSort(Sort.c);
				finishTime = System.currentTimeMillis();
				System.out.println("The time in milliseconds to insertion sort "
						+ "500 items is " + (finishTime - startTime));
				
				startTime = System.currentTimeMillis();
				Sort.d = Sort.insertionSort(Sort.d);
				finishTime = System.currentTimeMillis();
				System.out.println("The time in milliseconds to insertion sort "
						+ "1000 items is " + (finishTime - startTime));
				
				startTime = System.currentTimeMillis();
				Sort.e = Sort.insertionSort(Sort.e);
				finishTime = System.currentTimeMillis();
				System.out.println("The time in milliseconds to insertion sort "
						+ "1000 items is " + (finishTime - startTime));
				
				
			}
			if(inString1.equals("4"))
			{
				done = false;
			}
			if(inString1.equals("0"))
			{
				Sort.set();
			}
			
		}
	}

}
