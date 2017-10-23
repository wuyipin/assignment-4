package assignment;
import java.util.*;
public class Test {
	
	
	
	public static void main(String[] args) {
		ArrayList<Node> myList=new ArrayList<Node>();
		graph aa=new graph();
		Node a=new Node(1,"a");
		Node b=new Node(2,"b");
		Node c=new Node(3,"c");
		Node d=new Node(4,"d");
		Node e=new Node(5,"e");
		aa.addnode(a);
		aa.addnode(b);
		aa.addNeighbor(a, c);
		myList.add(d);
		myList.add(e);
		aa.addNeighbourList(b, myList);
		
	}
}
