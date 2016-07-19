package session4.assignment2;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
	
	static List<String> outputList;
	
	public static void main(String[] args)
	{
		outputList=new ArrayList<String>();
		new StringPermutations().getPermutations("AAAD");
		for(int index=0;index<outputList.size();index++)
		{
			System.out.println("from list    "+outputList.get(index));
		}
	}

	void getPermutations(String input)
	{
		if(outputList.contains(input))
		{
			return ;
		}
		else{
			outputList.add(input);
		}
		String combination="";
		int inputLength=input.length();
		String lastCharacter=""+(input.charAt(inputLength-1));
		for(int index=inputLength-2;index>=0;index--)
		{
			String firstPart=input.substring(0,index);
			String lastPart=input.substring(index,inputLength-1);
			combination=firstPart+lastCharacter+lastPart;
			//System.out.println("string  :"+combination);
			new StringPermutations().getPermutations(combination);			
		}
		
	}
}
