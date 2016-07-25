package session3.assignment1;


public class MainClass {

	public static void main(String[] args) {

		Player player1=new Player();
		Player player2=new Player();
		player1.setSymbol();
		String symbol1=player1.getSymbols().getSymbol();
		String symbol2="";
		Validations validations=new Validations();
		Display display=new Display();
		if(symbol1.equalsIgnoreCase("x"))
		{
			symbol2="0";
		}
		else
		{
			symbol2="X";
		}
		player2.setSymbol(symbol2);
		
		String status="continue";
		while(status.equalsIgnoreCase("continue"))
		{
			player1.getMove("player1",display.getState(),player1);
			display.diplayState();
			status=validations.getResult(display.getState());
			if(status.equalsIgnoreCase("continue"))
			{
				player2.getMove("player2",display.getState(),player2);
				display.diplayState();
				status=validations.getResult(display.getState());
				if(status.equalsIgnoreCase("win"))
				{
					System.out.println("*****************Player 2 Wins******************");
				}
			}
			else if(status.equalsIgnoreCase("win"))
			{
			System.out.println("*****************Player 1 Wins******************");
			}
			else if(status.equalsIgnoreCase("gameover"))
					{
				System.out.println("Sorry Noone wins....Gameover");
					}
		}
		
		
		
	}
}
