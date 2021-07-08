package LinkList;


public class Node {
	
	private Node next, pre;
	private Person myPerson;

	
	public Node(Person a)
	{
		myPerson = a;
		next = null;
	}

	
	public void setNext(Node a){
		next = a;}
	
	public Node getNext(){
		return next; }
	
	
	public void setPre(Node a)
	{
		pre = a;
	}
	
	public Node getPre()
	{
		return pre;
	}
	public String getName(){
	{
		return myPerson.getName();	
	}
	}
}