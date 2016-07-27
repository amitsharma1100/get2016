package session4.assignment1;

public class AdjacencyMatrix {
	 static int[][] adjacencyMatrix;

	public AdjacencyMatrix() {
		
	}
	public AdjacencyMatrix(int size) {
		AdjacencyMatrix.adjacencyMatrix = new int[size][size];
	}

	public int[][] getAdjacencyMatrix() {
		return adjacencyMatrix;
	}

	public void setAdjacencyMatrix(int[][] adjacencyMatrix) {
		AdjacencyMatrix.adjacencyMatrix = adjacencyMatrix;
	}
	public void display()
	{
		int size=AdjacencyMatrix.adjacencyMatrix.length;
		for(int rowIndex=0;rowIndex<size;rowIndex++)
		{
			for(int colIndex=0;colIndex<size;colIndex++)
			{
				System.out.print(adjacencyMatrix[rowIndex][colIndex]+" ");
			}
			System.out.println("");
		}
		
	}
}
