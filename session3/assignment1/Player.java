package session3.assignment1;

import java.util.Scanner;

public class Player {
	
	private Symbols symbols;
	
	public Symbols getSymbols() {
		return symbols;
	}
	public void setSymbols(Symbols symbols) {
		this.symbols = symbols;
	}
	public Player()
	{
		this.symbols=new Symbols();
	}
	public void setSymbol()
	{
		//this.symbols.setSymbol(symbol);
		System.out.println("Player 1 ,choose your symbol....'X' or '0'");
		Scanner scanner=new Scanner(System.in);
		String symbol1=scanner.next();
		
		Validations validations=new Validations();
		if(validations.isSymbolValid(symbol1))
		{
			this.symbols.setSymbol(symbol1);
		}
		else
		{
			System.out.println("Player 1,please enter a valid symbol");
			this.setSymbol();
		}
	}

	public void setSymbol(String symbol)
	{
		this.symbols.setSymbol(symbol);
	}

	public void getMove(String playerName,String[][] state,Player player)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println(playerName+" enter the row");
		int row=scanner.nextInt();
		System.out.println(playerName+" enter the column");
		int column=scanner.nextInt();
		Validations validations=new Validations();
		if(!validations.isMoveValid(row, column, state))
		{
			System.out.println(playerName+" enter a valid move");
			getMove(playerName, state,player);
		}
		else
		{
				state[row-1][column-1]=player.getSymbols().getSymbol();
			
		}
	}
	 
}
