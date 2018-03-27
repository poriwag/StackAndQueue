import java.util.*;

public class main {

	public static void main(String[] args)
	{
		TheQueue q1 = new TheQueue(10);
		
		Node n1 = new Node(1, "a");
		Node n2 = new Node(2, "b");
		Node n3 = new Node(3, "c");
		Node n4 = new Node(4, "d");
		Node n5 = new Node(5, "e");
		
		q1.insert(n1);
		q1.insert(n2);
		q1.remove();
		q1.insert(n3);
		q1.peek();
		
		q1.print();
		
		
	}
	
}
