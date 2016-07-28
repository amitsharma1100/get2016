package session4.assignment1;

import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author Amit
 *
 */
public class DisplayGraph {

	/**
	 * displays the social network
	 * Shows the name of each user and the all other users who are connected to that user
	 */
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
		try{
			//the menu keeps on popping until the user gives an exit command
		while(true)
		{
			System.out.println("\n\n**********Please choose************ \n\n1. Find if A is friend of B\n2. Search By Name\n3. Display The Network\n4. Edit Profile\n5. Find Mutual Friends\n6. Exit");
			
			int choice=scanner.nextInt();
			switch (choice) {
			case 1:	System.out.println("Enter first name");
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
			case 2:	System.out.println("Enter the name to be searched");
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
			case 4:System.out.println("Enter the profile you want to edit");
			       String profileToBeEdited=scanner.next();
			       Graph.editProfile(profileToBeEdited);
			       break;
			case 5:System.out.println("Enter the name of first user");
			       String friend1=scanner.next();
			       System.out.println("Enter the name of second user");
			       String friend2=scanner.next();
			       String mutuals=Graph.mutualFriends(friend1, friend2);
			       if(mutuals.equalsIgnoreCase(""))
			       {
			    	   System.out.println("Sorry No mutuals found");
			       }
			       else
			       {
			    	   System.out.println("Mutuals of "+friend1+" and "+friend2+"\n\n"+mutuals);
			       }
			       break;
			case 6:System.exit(-1);
			default:System.out.println("Enter a valid choice");
					break;
			}
			
		}
		}
		catch(Exception exception)
		{
			System.out.println("Something went wrong :"+exception.getMessage());
		}
		finally
		{
			if(scanner!=null)
			{
				scanner.close();
			}
		}
	}
	/**
	 * 
	 * @param node denotes the node Object whose details are to be displayed on the console
	 */
	public static void displaySingleNode(Node node)
	{
		System.out.println("NodeNumber:"+node.getNodeNumber());
		System.out.println("Name:"+node.getProfile().getName());
		System.out.println("Place:"+node.getProfile().getPlace());
		int typeOfNode=node.getType();
		if(typeOfNode==Constants.USER_NODE)
		{
			UserNode userNode=(UserNode)node;
			System.out.println("Type Of Node: User Node");
			System.out.println("Age"+userNode.getUserProfile().getAge()+"\n");
			System.out.println("Total Friends:"+userNode.getUserProfile().getFriendsCount());
		}
		else
		{
			OrganisationNode organisationNode=(OrganisationNode)node;
			System.out.println("Type Of Node: Organisation Node");
			System.out.println("Category:"+organisationNode.getOrganizationProfile().getGrade()+"\n");
		}	
		
	}
}