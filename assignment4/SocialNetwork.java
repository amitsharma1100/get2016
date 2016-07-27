package session4.aassignment1;

import java.io.IOException;

public class SocialNetwork {

	public static void main(String[] args) throws IOException {

		FileHandler fileHandler=new FileHandler();
		fileHandler.readFromFile();
		//new DisplayGraph().display();
		fileHandler.createAdjacencyMatrix();
		//new AdjacencyMatrix().display();
		
		DisplayGraph.menuDisplay();
	}

}
