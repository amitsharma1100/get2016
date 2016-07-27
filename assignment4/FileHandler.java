package session4.assignment1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {

	public void readFromFile() throws IOException {

		BufferedReader bufferedReader=null;
		try {
			 bufferedReader= new BufferedReader(new FileReader("C:\\Users\\Amit\\Documents\\Android Workspace\\OOPS\\src\\session4\\assignment1\\nodes.txt"));
			String currentLine = "";
			String[] commaSeparatedValues;
			Graph graph=new Graph();
			while ((currentLine = bufferedReader.readLine()) != null) {
				commaSeparatedValues = currentLine.split(",");
				int typeOfNode=Integer.parseInt(commaSeparatedValues[1]);
                if(typeOfNode==Constants.USER_NODE)
                {
                	UserNode userNode=new UserNode();
                	userNode.setNodeNumber(Integer.parseInt(commaSeparatedValues[0]));
                	userNode.setType(Constants.USER_NODE);
                	userNode.getProfile().setName(commaSeparatedValues[2]);
                	userNode.getProfile().setPlace(commaSeparatedValues[3]);
                   	userNode.getProfile().setType(Constants.USER_PROFILE);
                	userNode.getUserProfile().setAge(Integer.parseInt(commaSeparatedValues[4]));
                	userNode.getUserProfile().setFriendsCount(Constants.INITIAL_FRIEND_COUNT);
                  	Graph.graphNodes.add(userNode);
                }
                else 
                {
                   	OrganisationNode organisationNode=new OrganisationNode();
                	organisationNode.setNodeNumber(Integer.parseInt(commaSeparatedValues[0]));
                	organisationNode.setType(Constants.ORGANISATION_NODE);
                	organisationNode.getProfile().setName(commaSeparatedValues[2]);
                	organisationNode.getProfile().setPlace(commaSeparatedValues[3]);
                	organisationNode.getProfile().setType(Constants.ORGANISATION_PROFILE);
                	organisationNode.getOrganizationProfile().setGrade(Integer.parseInt(commaSeparatedValues[4]));
                   	Graph.graphNodes.add(organisationNode);
                }
                
			}
		} catch (FileNotFoundException fileNotFoundException) {
			System.out.println("The file could not be found "+fileNotFoundException.getMessage());

		}
		finally{
			if(bufferedReader!=null)
			{
				bufferedReader.close();
			}
			
		}
	}

	public void createAdjacencyMatrix() throws IOException
	{
		BufferedReader bufferedReader=null;
		try {
			 bufferedReader= new BufferedReader(new FileReader("C:\\Users\\Amit\\Documents\\Android Workspace\\OOPS\\src\\session4\\assignment1\\connections.txt"));
			 String currentLine = "";
			 String[] commaSeparatedValues;
			  AdjacencyMatrix adjacencyMatrix=new AdjacencyMatrix(FileHandler.getTotalLinesCount());
			 while ((currentLine = bufferedReader.readLine()) != null) {
				commaSeparatedValues = currentLine.split(",");
				int row=Integer.parseInt(commaSeparatedValues[0]);
				int column=Integer.parseInt(commaSeparatedValues[1]);
				AdjacencyMatrix.adjacencyMatrix[row-1][column-1]=1;
				AdjacencyMatrix.adjacencyMatrix[column-1][row-1]=1;
				
	}
		}
			 catch (FileNotFoundException fileNotFoundException) {
					System.out.println("The file could not be found "+fileNotFoundException.getMessage());

				}
				finally{
					if(bufferedReader!=null)
					{
						bufferedReader.close();
					}
					
}
	}
	
	public static int getTotalLinesCount() throws IOException
	{
		BufferedReader bufferedReader=null;
		 int count=0;
		try {
			 bufferedReader= new BufferedReader(new FileReader("C:\\Users\\Amit\\Documents\\Android Workspace\\OOPS\\src\\session4\\assignment1\\nodes.txt"));
			 while ((bufferedReader.readLine()) != null) {
				 count++;
			 }
		}
		catch(FileNotFoundException fileNotFoundException)
		{
			System.out.println("Something went wrong "+fileNotFoundException);
		}
		finally{
			bufferedReader.close();
		}
		return count;
		
	}
	
}