package session4.assignment3;

public class NQueenProblem {
	static int output[][];
	public static void main(String[] args) {
		NQueenProblem.output = new int[4][4];
		boolean status=new NQueenProblem().isPositionValid(output, 0, 0);
		System.out.println("insertion:"+status);
		status=new NQueenProblem().isPositionValid(output, 1, 0);
		System.out.println("insertion:"+status);
		status=new NQueenProblem().isPositionValid(output, 2, 1);
		System.out.println("insertion:"+status);
		for (int rowIndex = 0; rowIndex < 4; rowIndex++) {
			for (int columnIndex = 0; columnIndex < 4; columnIndex++) {
				System.out.print(" " + output[rowIndex][columnIndex]);
			}
			System.out.println("");
		}

	}

	int[][] solveNQ(int[][] input) {
		return input;
	}

	boolean isPositionValid(int[][] input, int row, int column) {
		boolean status = true;
		
		// check for already existing queen in a row
		for (int columnIndex = 0; columnIndex < 4; columnIndex++) {
			if (input[row][columnIndex] == 1) {
				return false;
			}
		}
		// check for already existing queen in a column
		for (int rowIndex = 0; rowIndex < 4; rowIndex++) {
			if (input[rowIndex][column] == 1) {
				return false;
			}
		}
		// check in the left diagonal
		if (row > 0 && column > 0 && input[row - 1][column - 1] == 1) {
			return false;
		}

		// check in the right diagonal
		if (row > 0 && column < 4 && input[row - 1][column + 1] == 1) {
			return false;
		}
		
		if(status)
		{
			//update column
			for(int rowIndex=0;rowIndex<4;rowIndex++)
			{
				input[rowIndex][column]=1;
			}
			
			//update row
			for(int columnIndex=0;columnIndex<4;columnIndex++)
			{
				input[row][columnIndex]=1;
			}
			
			//update left diagonal
			if(row>0 && column>0)
			{
				
			}
		}
		
		return status;
	}
	
	

}
