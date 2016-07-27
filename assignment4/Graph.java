package session4.aassignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Graph {

	static List<Node> graphNodes;

	public Graph() {
		Graph.graphNodes = new ArrayList<Node>();
	}

	public List<Node> getGraphNodes() {
		return graphNodes;
	}

	public void setGraphNodes(List<Node> graphNodes) {
		Graph.graphNodes = graphNodes;
	}
	
	public static  Node searchByName(String name)
	{
		int totalNodes=Graph.graphNodes.size();
		for(int index=0;index<totalNodes;index++)
		{
			if(Graph.graphNodes.get(index).getProfile().name.equalsIgnoreCase(name))
			{
				return Graph.graphNodes.get(index);
			}
		}
		return null;
	}
	public static  int searchByNameEdit(String name)
	{
		int toBeReturned=-1;
		int totalNodes=Graph.graphNodes.size();
		for(int index=0;index<totalNodes;index++)
		{
			if(Graph.graphNodes.get(index).getProfile().name.equalsIgnoreCase(name))
			{
				toBeReturned=index;
			}
		}
		return toBeReturned;
		
	}
	
	public static boolean isFriend(String user1,String user2)
	{
		boolean status=false;
		Node node1=Graph.searchByName(user1);
		Node node2=Graph.searchByName(user2);
		if(node1==null || node2==null)
		{
			status=false;
		}
		else 
		{
			int nodeNumber1=node1.getNodeNumber();
			int nodeNumber2=node2.getNodeNumber();
			if(AdjacencyMatrix.adjacencyMatrix[nodeNumber1-1][nodeNumber2-1]==1)
			{
				status=true;
			}
		}
		
		
		return status;
	}
	
	public static boolean deleteProfile(String name)
	{
		boolean status=false;
		Node node=Graph.searchByName(name);
		if(node==null)
		{
			status=false;
		}
		else
		{
			Graph.graphNodes.remove(node);
			status=true;
		}
		return status;
	}
	public static boolean editProfile(String name)
	{
		Node node=Graph.searchByName(name);
		boolean toBeReturned=false;
		int status=Graph.searchByNameEdit(name);
		if(status!=-1)
		{
			toBeReturned=true;
			System.out.println("******Previous details are*************");
			DisplayGraph.displaySingleNode(node);
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the name");
			String updatedName=scanner.next();
			System.out.println("Enter the place");
			String updatedPlace=scanner.next();
			node.getProfile().setName(updatedName);
			node.getProfile().setPlace(updatedPlace);
			Graph.graphNodes.add(status, node);
			System.out.println("******Updated details are*************");
			DisplayGraph.displaySingleNode(node);
		}
		return toBeReturned;
	
	}
}
