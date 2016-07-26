package session5.assignment1;

import java.util.List;
import java.util.Scanner;

public class Display {
	
	public void diplayMenu(List<MenuItem> menuItemList)
	{
		if(menuItemList==null || menuItemList.size()==0)
		{
			System.out.println("The list is empty");
			return ;
		}
		else
		{
			System.out.println("Choose:");
			for(MenuItem menuItem:menuItemList)
			{
				System.out.println("\t"+menuItem.getLabel());
			}
		}
	}
	
	public void display(Menu menu,int level)
	{
		List<MenuItem> menuItemList=menu.getMenuItems();
		int totalMenuItems=menuItemList.size();
		for(int index=0;index<totalMenuItems;index++)
		{
			System.out.println((index+1+" ")+menuItemList.get(index).getLabel());
			
		}
		int userInput = 0;
		String input="";
		boolean toContinue=false;
		while(!toContinue)
		{
			System.out.println("Please choose an option");
			input=new Scanner(System.in).next();
			toContinue=Display.isInputValid(input, Constants.TYPE_IS_NUMBER_INPUT, totalMenuItems);
		}
		userInput=Integer.parseInt(input);
		if(menuItemList.get(userInput-1).getType()==Constants.TYPE_IS_MENU)
		{
			Stack.pointer+=1;
			Stack.menu[Stack.pointer]=menu;
			display(menuItemList.get(userInput-1).menu,level+1);
		}
		else if(menuItemList.get(userInput-1).getType()!=Constants.TYPE_IS_MENU && menuItemList.get(userInput-1).getType()!=Constants.TYPE_IS_BACK)
		{
		System.out.println("The input is not valid please try again");	
		}
		else if(menuItemList.get(userInput-1).getType()==Constants.TYPE_IS_BACK && level==1)
		{
		 System.exit(-1);
		}
		else if(menuItemList.get(userInput-1).getType()==Constants.TYPE_IS_BACK && level!=1)
				{
			     Stack.pointer-=1;
			     display(Stack.menu[Stack.pointer+1], level-1);
				}
	}
	
	public static boolean isInputValid(String input,int type,int length)
	{
		boolean status=true;
		if((type==Constants.TYPE_IS_NUMBER_INPUT && input.length()>1 && (input.codePointAt(0)<48 || input.codePointAt(0)>57)) ||(type==Constants.TYPE_IS_STRING_INPUT && input.length()==0) || (type==Constants.TYPE_IS_NUMBER_INPUT && Integer.parseInt(input)>length))
		{
				status=false;
		
		}
		return status;
	}

}