

public class Sort {
	
	public static int[] a = new int[20], b = new int[100], 
			c = new int[500], d = new int[1000], e= new int[10000];
	public static void set()
	{
		for(int index = 0; index < a.length ; index++)
		{
			a[index] = (int) (Math.random()*100);
		}
		
		for(int index = 0; index < b.length ; index++)
		{
			b[index] = (int) (Math.random()*100);
		}
		
		for(int index = 0; index < c.length ; index++)
		{
			c[index] = (int) (Math.random()*100);
		}
		
		for(int index = 0; index < d.length ; index++)
		{
			d[index] = (int) (Math.random()*100);
		}
		
		for(int index = 0; index < e.length ; index++)
		{
			e[index] = (int) (Math.random()*100);
		}
		
		
	}
	
	public static void bubbleSortA()
	{	
		int count =0;
		
		for(int index = 0; index < a.length; index++)
		{
		
			if(index < a.length-1){
			if(a[index] > a[index+1])
			{
				int pre = a[index];
				a[index] = a[index+1];
				a[index+1] = pre;
				count++;
			}
			}
			
		}
		if(count != 0)
		{	
			bubbleSortA();
		}
		
	}
	
	public static void bubbleSortB()
	{
		int count =0;
		
		for(int index = 0; index < b.length; index++)
		{
		
			if(index < b.length-1){
			if(b[index] > b[index+1])
			{
				int pre = b[index];
				b[index] = b[index+1];
				b[index+1] = pre;
				count++;
			}
			}
			
		}
		if(count != 0)
		{	
			bubbleSortB();
		}
		
	}
	
	public static void bubbleSortC()
	{
		int count =0;
		
		for(int index = 0; index < c.length; index++)
		{
		
			if(index < c.length-1){
			if(c[index] > c[index+1])
			{
				int pre = c[index];
				c[index] = c[index+1];
				c[index+1] = pre;
				count++;
			}
			}
			
		}
		if(count != 0)
		{	
			bubbleSortC();
		}
		
	}
	
	public static void bubbleSortD()
	{
		int count =0;
		
		for(int index = 0; index < d.length; index++)
		{
		
			if(index < d.length-1){
			if(d[index] > d[index+1])
			{
				int pre = d[index];
				d[index] = d[index+1];
				d[index+1] = pre;
				count++;
			}
			}
			
		}
		if(count != 0)
		{	
			bubbleSortD();
		}
		
	}

	public static void bubbleSortE()
	{
		int count =0;
		
		for(int index = 0; index < e.length; index++)
		{
		
			if(index < e.length-1){
			if(e[index] > e[index+1])
			{
				int pre = e[index];
				e[index] = e[index+1];
				e[index+1] = pre;
				count++;
			}
			}
			
		}
		if(count != 0)
		{	
			bubbleSortE();
		}
		
	}
	
	public static void printAll()
	{	int counter = 0;
	
			//Print for a
		System.out.println("-----------------");
		System.out.println("This array has "+a.length+" items");
		while(counter < a.length)
		{
			System.out.print(a[counter++]+", ");
			if(counter%20== 0)
			{
				System.out.println();
			}
		}
		
		//print for b
		System.out.println();
		System.out.println("--------------------------");
		counter = 0;
		System.out.println("This array has "+b.length+" items");
		while(counter < b.length)
		{
			System.out.print(b[counter++]+", ");
			if(counter%20== 0)
			{
				System.out.println();
			}
		}
		
		//print for c
		System.out.println();
		System.out.println("--------------------------");
		counter = 0;
		System.out.println("This array has "+c.length+" items");
		
		while(counter < c.length)
		{
			System.out.print(c[counter++]+", ");
			if(counter%20== 0)
			{
				System.out.println();
			}
		}
		
		//print for d
		System.out.println();
		System.out.println("--------------------------");
		counter = 0;
		System.out.println("This array has "+d.length+" items");
		while(counter < d.length)
				{
					System.out.print(d[counter++]+", ");
					if(counter%20== 0)
					{
						System.out.println();
					}
				}
		
		//print for e
				System.out.println();
				System.out.println("--------------------------");
				counter = 0;
				System.out.println("This array has "+e.length+" items");
				while(counter < e.length)
						{
							System.out.print(e[counter++]+", ");
							if(counter%20== 0)
							{
								System.out.println();
							}
						}
				
		
		
		
	}

	
	public static int[] insertionSort(int[] input){
        
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
}
