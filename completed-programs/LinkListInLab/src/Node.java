
public class Node {
	
	private Node next;
	private Student myStudent;

	
	public Node(Student a){
		myStudent = a;
		next = null;
		}

	
	public void setNext(Node a){
		next = a;}
	
	public Node getNext(){
		return next; }
	
	
	public int getid(){
		return myStudent.getID();}
	
	public String getName(){
		return myStudent.getName();}
	
	public String getData()
	{
		String out = "Name: "+myStudent.getName()+ " ID Number:" + myStudent.getID();
		return out;
	
	}

	
}
