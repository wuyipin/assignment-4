package assignment;
import java.util.*;
//undirected graph
public class graph {
	public graph() {}
	Map<Node,List<Node>> agraph=new HashMap<>();
	public void addnode(Node n)
	{
		if(!agraph.containsKey(n))
		{
			agraph.put(n, new ArrayList<Node>());
			
		}
		
	}
	//
	public void addNeighbor(Node parent ,Node neighbor)
	{
		if(agraph.containsKey(parent))
		{
			agraph.get(parent).add(neighbor);
			//n.add(neighbor);
			if(agraph.containsKey(neighbor))
			{
				agraph.get(neighbor).add(parent);
			}
			else
			{
				agraph.put(neighbor, new ArrayList<Node>());
				
			}
		}
		else
		{
			System.out.println("Node parent doesn't exist,please use addnode method ");
		}
	}

	public void addNeighbourList(Node p, List<Node> nList)
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
	public List<Node> getNeigboursOfNode(Node n)
	{
		return agraph.get(n);
	}
	public void deleteNeighbour(Node p, Node n)
	{
		if(agraph.containsKey(p))
		{
			agraph.get(p).remove(n);
		
		}
	}
}
