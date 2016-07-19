package session3.assignment2;

public class RecursiveLinearSearch {
	
	public static void main(String[] args)
	{
		int input[]={2,5,8,9,10, 77, 55};
		boolean found=new RecursiveLinearSearch().search(input,77);
		System.out.println("Result:"+found);
	}
	
	boolean search(int[] input,int key)
	{
		if(input.length==0)
		{
			return false;
		}
		if(input[0]==key)
		{
			return true;
		}
		else
		{
			int inputLength=input.length;
			int[] nextArray=new int[inputLength-1];
			for(int index=1;index<inputLength;index++)
			{
				nextArray[index-1]=input[index];
			}
			return search(nextArray,key);
		}
	}

}
