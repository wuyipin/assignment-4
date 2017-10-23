package assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class labledDirectedGraph extends DirectedGraph{
	Map<Node,List<String>> aDirectedGraph=new HashMap<Node,List<String>>();
	public void addnode(Node n)
	{
		if(!agraph.containsKey(n))
		{
			agraph.put(n, new ArrayList<Node>());
			aDirectedGraph.put(n, new ArrayList<String>());
		}
		
	}
	public void addNeighbor(Node parent ,Node neighbor,String label)
	{	
		
		
		if(agraph.containsKey(parent))
		{
			agraph.get(parent).add(neighbor);
			aDirectedGraph.get(parent).add(label);
			
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
			aDirectedGraph.put(p, aList);
		
		}
		else
		{
			agraph.get(p).addAll(nList);
			aDirectedGraph.get(p).addAll(aList);
		}
	}
	public void deleteNeighbour(Node p, Node n,String pn)
	{
		if(agraph.containsKey(p))
		{
			agraph.get(p).remove(n);
			aDirectedGraph.get(p).remove(pn);
	
		}
	}
}
