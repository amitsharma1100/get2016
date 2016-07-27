package session4.aassignment1;

import java.util.List;
import java.util.Scanner;

public class DisplayGraph {

	public void display()
	{
		List<Node> graphNodeList=Graph.graphNodes;
		int totalNodes=graphNodeList.size();
		for(int index=0;index<totalNodes;index++)
		{
			System.out.print("NodeNumber:"+graphNodeList.get(index).NodeNumber);
			System.out.print("\tType of node:"+graphNodeList.get(index).type);
			System.out.print("\tName:"+graphNodeList.get(index).getProfile().getName());
			System.out.println("\tPlace:"+graphNodeList.get(index).getProfile().getPlace());
			
		}
	}
	
	public void displaySocialNetwork()
	{
		int[][] adjacencyMatrix=AdjacencyMatrix.adjacencyMatrix;
		List<Node> nodeList=Graph.graphNodes;
		int totalNodes=nodeList.size();
		int columns=adjacencyMatrix[0].length;
		System.out.println("Name \t\tConnected to\n");
		
		for(int index=0;index<totalNodes;index++)
		{
			System.out.print(nodeList.get(index).getProfile().getName()+"\t\t");
			
			for(int colIndex=0;colIndex<columns;colIndex++)
			{	
				if(adjacencyMatrix[index][colIndex]==1)
				{
					System.out.print(nodeList.get(colIndex).getProfile().getName()+",");
				}
				
			}
			System.out.println();
	
		}
	}
	public static void menuDisplay()
	{
		Scanner scanner =new Scanner(System.in);
		while(true)
		{
			System.out.println("\n\n**********Please choose************ \n\n:\n1. Find if A is friend of B\n2. Search By Name\n3. Display The Network\n4. Delete a profile\n5. Edit Profile\n6. Exit");
			
			int choice=scanner.nextInt();
			switch (choice) {
			case 1:System.out.println("Enter first name");
			      String firstName=scanner.next();
			      System.out.println("Enter the second name");
			      String secondName=scanner.next();
			      if(Graph.isFriend(firstName, secondName))
			      {
			    	  System.out.println(firstName+ " and "+secondName+" are friends");
			      }
			      else
			      {
			    	  System.out.println(firstName+ " and "+secondName+" are not friends");
			      }
			      
				break;
			case 2:
				System.out.println("Enter the name to be searched");
				Node node=Graph.searchByName(scanner.next());
				if(node==null)
				{
					System.out.println("No record found");
				}
				else
				{
					System.out.println("NodeNumber:"+node.getNodeNumber());
					System.out.println("Type:"+(node.getType()==Constants.ORGANISATION_NODE?"Organisation Node":"User Node"));
					System.out.println("Name:"+node.getProfile().getName());
					System.out.println("Place:"+node.getProfile().getPlace());
				}
				break;
			case 3:new DisplayGraph().displaySocialNetwork();
					break;
			case 4:System.out.println("Enter the name to be deleted");
					String nameToBeDeleted=scanner.next();
					if(Graph.deleteProfile(nameToBeDeleted))
					{
						System.out.println("Successfully deleted "+nameToBeDeleted+"'s profile");
					}
					else
					{
						System.out.println("Can't delete because the user does not exist");;
					}
					break;
			case 5:System.out.println("Enter the profile you want to edit");
			       String profileToBeEdited=scanner.next();
			       Graph.editProfile(profileToBeEdited);
			       break;
			case 6:System.exit(-1);
			default:System.out.println("Enter a valid choice");
				break;
			}
			
		}
	}
	public static void displaySingleNode(Node node)
	{
		System.out.println("NodeNumber:"+node.getNodeNumber());
		System.out.println("Type of node:"+(node.getType()==Constants.ORGANISATION_NODE?"Organisation Node":"User Node"));
		System.out.println("Name:"+node.getProfile().getName());
		System.out.println("Place:"+node.getProfile().getPlace());
	}
}
