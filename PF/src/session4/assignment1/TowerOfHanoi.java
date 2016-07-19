package session4.assignment1;

public class TowerOfHanoi {

	
	void getTowerSolution(int numberOfDisks,String start,String auxillary,String destination)
	{
		if(numberOfDisks==1)
		{
			System.out.println(start+"-->"+destination);
		}
		else
		{
			getTowerSolution(numberOfDisks-1, start,  destination,auxillary);
			System.out.println(start+"-->"+destination);
			getTowerSolution(numberOfDisks-1,auxillary,start, destination);
		}
	}
	
	public static void main(String[] args)
	{
		TowerOfHanoi towerOfHanoi=new TowerOfHanoi();
		towerOfHanoi.getTowerSolution(2, "A", "B", "C");
	}
}
