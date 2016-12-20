package session4.assignment1;

/**
 * 
 * @author amit
 *
 */
public class AdjacencyMatrix {
	
	// static array to keep neighbours' details
	static int[][] adjacencyMatrix;

	// default  constructor
	public AdjacencyMatrix() {

	}

	// initialize the size of the adjacency matrix
	public AdjacencyMatrix(int size) {
		AdjacencyMatrix.adjacencyMatrix = new int[size][size];
	}

	public int[][] getAdjacencyMatrix() {
		return adjacencyMatrix;
	}

	public void setAdjacencyMatrix(int[][] adjacencyMatrix) {
		AdjacencyMatrix.adjacencyMatrix = adjacencyMatrix;
	}

}
