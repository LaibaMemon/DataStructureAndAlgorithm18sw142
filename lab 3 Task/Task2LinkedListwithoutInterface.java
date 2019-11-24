class Node
{
	Node next;
	int data;
	Node(int data)
	{
	   this.data=data;
	}
}
class Task2LinkedListwithoutInterface
{
  public static void main(String [] args)
	{
	  System.out.println("First method ");           //1st method
	  Node start=new Node(11);                            // object of node class 
	  start.next=new Node(22);
	  start.next.next=new Node(33);                        //this node is pointing to the next node
	  for(Node p=start ; p!=null ; p=p.next)  
	 	{
	 	 	System.out.println(p.data);                     // this will print the whole data of node
	    }
	}
}