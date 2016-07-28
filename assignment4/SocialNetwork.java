package session4.assignment1;

import java.io.IOException;

/**
 * 
 * @author Amit
 * this is the main class
 *
 */
public class SocialNetwork {

	public static void main(String[] args) throws IOException {

		// create a file handler object to perform i/o operations
		FileHandler fileHandler=new FileHandler();
		fileHandler.readFromFile();
		
		// create the adjacency matrix to keep track of the friends of each node
		fileHandler.createAdjacencyMatrix();
		
		// display the main menu
		DisplayGraph.menuDisplay();
	}

}
