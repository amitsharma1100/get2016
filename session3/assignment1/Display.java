package session3.assignment1;

public class Display {

	private String[][] state;

	public Display()
	{
		this.state=new String[3][3];
		for(int row=0;row<3;row++)
		{
			for(int column=0;column<3;column++)
			{
				state[row][column]=" ";
			}
		}
	}
	public String[][] getState() {
		return state;
	}

	public void setState(String[][] state) {
		this.state = state;
	}
	
	public void diplayState()
	{
		for(int row=0;row<3;row++)
		{
			for(int column=0;column<3;column++)
			{
				System.out.print("   "+state[row][column]+" |");
			}
			System.out.println();
			System.out.println("-------------------");
			
			
		}
	}
	
	
}
