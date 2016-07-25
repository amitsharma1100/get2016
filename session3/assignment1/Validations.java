package session3.assignment1;

public class Validations {

	private static final int ROWS = 3;
	private final int COLUMNS = 3;

	public static int getROWS() {
		return ROWS;
	}

	public int getCOLUMNS() {
		return COLUMNS;
	}

	public boolean isMoveValid(int row, int column, String[][] state) {
		boolean status = true;

		if ((row > ROWS + 1) || column > (COLUMNS + 1)
				|| state[row - 1][column - 1].equalsIgnoreCase("X")
				|| state[row - 1][column - 1].equalsIgnoreCase("0")) {
			status = false;
		}

		return status;
	}

	public boolean isSymbolValid(String symbol) {
		boolean status = false;
		if (symbol.equalsIgnoreCase("X") || symbol.equalsIgnoreCase("0")) {
			status = true;
		}
		return status;
	}

	public String getResult(String[][] state) {

		if (isGameOver(state).equalsIgnoreCase("yes")) {
			return "gameover";
		}
		String result = "continue";
		if (checkRow(state).equalsIgnoreCase("win")
				|| checkColumn(state).equalsIgnoreCase("win")
				|| checkLeftDiagonal(state).equalsIgnoreCase("win")
				|| checkRightDiagonal(state).equalsIgnoreCase("win")) {
			return "win";
		}

		return result;
	}

	public String checkRow(String[][] state) {
		String result = "";
		for (int rowIndex = 0; rowIndex < ROWS; rowIndex++) {
			String symbol = "x";
			if (state[rowIndex][0].equalsIgnoreCase(symbol)
					&& state[rowIndex][1].equalsIgnoreCase(symbol)
					&& state[rowIndex][2].equalsIgnoreCase(symbol)) {
				result = "win";
				return result;
			} else {
				symbol = "0";
				if (state[rowIndex][0].equalsIgnoreCase(symbol)
						&& state[rowIndex][1].equalsIgnoreCase(symbol)
						&& state[rowIndex][1].equalsIgnoreCase(symbol)) {
					result = "win";
					return result;
				}
			}
		}
		return result;

	}

	public String checkColumn(String[][] state) {
		String result = "";
		for (int columnIndex = 0; columnIndex < COLUMNS; columnIndex++) {
			String symbol = "x";
			if (state[0][columnIndex].equalsIgnoreCase(symbol)
					&& state[1][columnIndex].equalsIgnoreCase(symbol)
					&& state[2][columnIndex].equalsIgnoreCase(symbol)) {
				result = "win";
				return result;
			} else {
				symbol = "0";
				if (state[0][columnIndex].equalsIgnoreCase(symbol)
						&& state[1][columnIndex].equalsIgnoreCase(symbol)
						&& state[2][columnIndex].equalsIgnoreCase(symbol)) {
					result = "win";
					return result;
				}
			}
		}
		return result;
	}

	public String checkLeftDiagonal(String[][] state) {
		String result = "";

		String symbol = "x";
		if (state[0][0].equalsIgnoreCase(symbol)
				&& state[1][1].equalsIgnoreCase(symbol)
				&& state[2][2].equalsIgnoreCase(symbol)) {
			result = "win";
			return result;
		} else {
			symbol = "0";
			if (state[0][0].equalsIgnoreCase(symbol)
					&& state[1][1].equalsIgnoreCase(symbol)
					&& state[2][2].equalsIgnoreCase(symbol)) {
				result = "win";
				return result;
			}
		}

		return result;
	}

	public String checkRightDiagonal(String[][] state) {
		String result = "";

		String symbol = "x";
		if (state[0][2].equalsIgnoreCase(symbol)
				&& state[1][1].equalsIgnoreCase(symbol)
				&& state[2][0].equalsIgnoreCase(symbol)) {
			result = "win";
			return result;
		} else {
			symbol = "0";
			if (state[0][2].equalsIgnoreCase(symbol)
					&& state[1][1].equalsIgnoreCase(symbol)
					&& state[2][0].equalsIgnoreCase(symbol)) {
				result = "win";
				return result;
			}
		}

		return result;
	}

	public String isGameOver(String[][] state) {
		String status = "yes";
		outerloop: for (int rowIndex = 0; rowIndex < ROWS; rowIndex++) {
			for (int columnIndex = 0; columnIndex < COLUMNS; columnIndex++) {
				if (state[rowIndex][columnIndex].equalsIgnoreCase(" ")) {
					status = "no";
					break outerloop;
				}
			}
		}

		return status;

	}
}
