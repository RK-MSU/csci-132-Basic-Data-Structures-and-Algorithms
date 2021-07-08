
public class LinkList {
	
	private static Node first, last;
	
	
	
	public LinkList() {
		first = null;
		last = null;
	}
	
	public void addNode(Node input)
	{
		if(first == null)
		{
			first = input;
			last = first;
		}
		else
		{
			last.setNext(input);
			last = last.getNext();
		}
	
	}
	

	public void print()
	{
		int count = 1;
		for(Node a = first; a != null;count++, a = a.getNext())
		{
			System.out.println(count+". "+a.getData());
			
		}
	}

	public static void search(String a, int b) {
		
		int counter = 0;
		for(Node search = first ; search != null ; search = search.getNext())
		{
			if(a.equals(search.getName()) && b == search.getid()){
				System.out.println("This name exsists");
				System.out.println(search.getData());
				counter++;
				System.out.println("");
				}
		}
		
			if(counter < 1){
			System.out.println("Name Does not exsist"); }
	}
	
	public static void delete(String a){
		Node search;
		boolean done = true;
		Node pre = first;
		int counter = 1;
		for(search = first ; done ; search = search.getNext())
		{
			
			if(a.equals(search.getName()) && counter == 1)
			{
			first = search.getNext();
			done = false;
				}
			else if(a.equals(search.getName()) && counter > 1)
			{
				pre.setNext(search.getNext());
				done = false;
				}
			else if(search.equals(last))
			{
				pre.setNext(null);
			}
		pre = search;
		counter++;
		
		}
	}
	
}
	


