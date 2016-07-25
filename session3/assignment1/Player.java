package session3.assignment1;

import java.util.Scanner;

public class Player {

	private static Scanner scanner;
	private Symbols symbols;

	public Symbols getSymbols() {
		return symbols;
	}

	public void setSymbols(Symbols symbols) {
		this.symbols = symbols;
	}

	public Player() {
		this.symbols = new Symbols();
		scanner = new Scanner(System.in);
	}

	/* sets symbol for player 1 */
	public void setSymbol() {
		System.out.println("Player 1 ,choose your symbol....'X' or '0'");
		scanner = new Scanner(System.in);
		String symbol1 = scanner.next();

		Validations validations = new Validations();
		if (validations.isSymbolValid(symbol1)) {
			this.symbols.setSymbol(symbol1);
		} else {
			System.out.println("Player 1,please enter a valid symbol");
			this.setSymbol();
		}
	}

	public void setSymbol(String symbol) {
		this.symbols.setSymbol(symbol);
	}

	/*take input from the user for the move*/
	public void getMove(String playerName, String[][] state, Player player) {
		System.out.println(playerName + " enter the row");
		int row = scanner.nextInt();
		System.out.println(playerName + " enter the column");
		int column = scanner.nextInt();
		Validations validations = new Validations();
		if (!validations.isMoveValid(row, column, state)) {
			System.out.println(playerName + " enter a valid move");
			getMove(playerName, state, player);
		} else {
			state[row - 1][column - 1] = player.getSymbols().getSymbol();

		}

	}

	/*free up the resources*/
	public void freeResources() {
		scanner.close();
	}

}
