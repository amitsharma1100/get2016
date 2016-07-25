package session3.assignment1;

/*creates objects and calls corresponding methods*/
public class MainClass {

	public static void main(String[] args) {

		//create 2 players
		Player player1=new Player();
		Player player2=new Player();
		
		//assign symbol for player1
		player1.setSymbol();
		String symbol1=player1.getSymbols().getSymbol();
		
		//assign sysmbol to player 2
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
		
		//begin game and continue until game gets over or one of the player wins
		String status="continue";
		while(status.equalsIgnoreCase("continue"))
		{
			//ask player 1 to make a move
			player1.getMove("player1",display.getState(),player1);
			
			//display the move if it is a valid move
			display.diplayState();
			
			//check what the result is after player 1 makes a valid move
			status=validations.getResult(display.getState());
			
			//continue if the game has not ended
			if(status.equalsIgnoreCase("continue"))
			{
				//ask player 2 to make a move
				player2.getMove("player2",display.getState(),player2);
				
				//display the move if it is a valid move
				display.diplayState();
				
				//check what the result is after player 2 makes a valid move
				status=validations.getResult(display.getState());
				
				//if the result is win then player 2 wins
				if(status.equalsIgnoreCase("win"))
				{
					System.out.println("*****************Player 2 Wins******************");
				}
			}
			
			//if the result is win then player 1 wins
			else if(status.equalsIgnoreCase("win"))
			{
			System.out.println("*****************Player 1 Wins******************");
			}
			
			//when the result is gameover
			else if(status.equalsIgnoreCase("gameover"))
					{
				System.out.println("Sorry Noone wins....Gameover");
					}
		}
		
		//finally free the resources
		new Player().freeResources();
		
	}
}
