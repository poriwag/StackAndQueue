import java.util.Arrays;

public class TheQueue {
	
	private Node[] NodeArray;
	private int queueSize;
	
	//sets stack as empty = -1
	private int front, numberOfItems, rear = 0;
	
	
	
	public TheQueue(int size) {
		this.queueSize = size;
		NodeArray  = new Node[size];
	}
	
	public void insert(Node n) {
		
		if (numberOfItems + 1 <= queueSize)
		{
			NodeArray[rear] = n;
			rear++;
			numberOfItems++;
			System.out.println("Name: " + n.getName() + "|| Data: " + n.getData() + "ADDED");
		}
		else
		{
			System.out.println("Queue is Full, Try removing a Node");
		}
		
	}
	
	/*public void priorityInsert(Node n)
	{
		if (numberOfItems == 0)
		{
			insert(n);
		}
		else {
			for(int i = 1; i < numberOfItems-1; i++)
			{
				NodeArray[i+1] = NodeArray[i];
			}
		}
		
		rear++;
		numberOfItems++;
		
	}
	*/
	
	public void remove() {
		if(numberOfItems > 0)
		{
			System.out.println(NodeArray[front].getName() + "Has been Removed");
			front++;
			numberOfItems--;
		}
		else
		{
			System.out.println("Queue is Empty");
		}
	}
	
	public void peek() {
		
		if (numberOfItems != 0)
		{
			System.out.println("front of the Queue is " + NodeArray[front].getName());
		}
		else
		{
			System.out.println("Queue is empty");
		}
	}
	
	//traverse
	public void print()
	{
		for(int i = front; i != rear; ++i )
		{	
			if (i == NodeArray.length)
			{
				i = 0;
			}
			
			System.out.println(NodeArray[i].getName());
		}
	}
	
}
