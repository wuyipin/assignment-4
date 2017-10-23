package assignment;

import java.util.ArrayList;

public class TestlabledDirectedGraph {
	public static void main(String[] args) {
		//ArrayList<Node> myList=new ArrayList<Node>();
		labledDirectedGraph aa=new labledDirectedGraph();
		Node red=new Node(1,"red");
		Node green=new Node(2,"green");
		Node white=new Node(3,"white");
		Node blue=new Node(4,"blue");
		//Node e=new Node(5,"e");
		aa.addnode(blue);
		aa.addnode(white);
		aa.addnode(green);
		aa.addnode(red);
		//myList.add(green);
		//myList.add(red);
		aa.addNeighbor(red, white,"white,green");
		aa.addNeighbor(red, blue,"blue");
		aa.addNeighbor(green,red,"red,blue,white");
		aa.addNeighbor(blue, green,"white,green,red");
		aa.addNeighbor(white,red,"blue");
		aa.addNeighbor(white, blue,"green,red");
		//aa.addNeighbourList(b, myList);
		
	}
}
