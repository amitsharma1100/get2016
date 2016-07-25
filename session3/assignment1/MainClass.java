package session3.assignment1;

/*creates objects and calls corresponding methods*/
public class MainClass {

	public static void main(String[] args) {

		//create 2 players
		Player player=new Player();
			
		//assign symbol for player1
		player.setSymbol();
		String symbol1=player.getSymbols().getSymbol();
		
		//assign symbol to computer
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
		Computer computer=new Computer();
		computer.setSymbol(symbol2);
		
		//begin game and continue until game gets over or one of the player wins
		String status="continue";
		while(status.equalsIgnoreCase("continue"))
		{
			//ask player to make a move
			player.getMove(display.getState());
			
			//display the move if it is a valid move
			display.diplayState("Player 1");
			
			//check what the result is after player 1 makes a valid move
			status=validations.getResult(display.getState());
			
			//continue if the game has not ended
			if(status.equalsIgnoreCase("continue"))
			{
				//ask player 2 to make a move
				computer.getComputerMove(display.getState());
				
				//display the move if it is a valid move
				display.diplayState(computer.getPLAYER_NAME());
				
				//check what the result is after player 2 makes a valid move
				status=validations.getResult(display.getState());
				
				//if the result is win then player 2 wins
				if(status.equalsIgnoreCase("win"))
				{
					System.out.println("*****************Computer Wins******************");
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
				System.out.println("Sorry No One wins....Gameover");
					}
		}
		
		//finally free the resources
		new Player().freeResources();
		
	}
}
