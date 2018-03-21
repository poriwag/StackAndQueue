
public class Node {
	int data;
	String name;
	
	
	//constructors
	public Node()
	{
		this.data = 0;
		this.name = "";
	}
	public Node(int d, String s)
	{
		this.data = d;
		this.name = s;
	}

	//setters and getters 
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
