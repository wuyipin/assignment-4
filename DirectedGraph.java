package assignment;

import java.util.*;
//directed graph
public class DirectedGraph extends graph{
	public void addnode(Node n)
	{
		if(!agraph.containsKey(n))
		{
			agraph.put(n, new ArrayList<Node>());
		}
		
	}
	public void addNeighbor(Node parent ,Node neighbor,String label)
	{	
		
		
		if(agraph.containsKey(parent))
		{
			agraph.get(parent).add(neighbor);
			
			
		}
		else
		{
			System.out.println("Node parent doesn't exist,please use addnode method ");
		}
	}
	public void addNeighbourList(Node p, ArrayList<Node> nList,ArrayList<String> aList)
	{
		if(!agraph.containsKey(p))
		{	
			agraph.put(p, nList);
			
		
		}
		else
		{
			agraph.get(p).addAll(nList);
			
		}
	}
	public void deleteNeighbour(Node p, Node n,String pn)
	{
		if(agraph.containsKey(p))
		{
			agraph.get(p).remove(n);
	
	
		}
	}
}
