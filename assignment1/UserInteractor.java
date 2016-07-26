package session5.assignment1;

import java.util.Scanner;

public class UserInteractor {
	
	public static void getUserInput(Menu menu,String menuLabel)
	{
		boolean toContinue=false;
		int totalMenuItems=0;
        String input="";
        Scanner scanner=new Scanner(System.in);
		while(!toContinue)
		{
			System.out.println("Enter the no of menu items for "+menuLabel);
			input=scanner.next();
			toContinue=UserInteractor.isInputValid(input);
			if(!toContinue)
			{
				System.out.println("Please enter a valid choice");
			}
		}
		totalMenuItems=Integer.parseInt(input);
		for(int index=0;index<totalMenuItems;index++)
		{
			System.out.println("Enter the name for menuitem "+(index+1)+" for "+menuLabel);
			String menuitemLabel=scanner.next();
			MenuItem menuItem=new MenuItem();
			menuItem.setLabel(menuitemLabel);
			System.out.println("Does "+menuitemLabel+" contains submenu?\n Press 'y' or 'n'");
			String response=scanner.next();
			if(response.equalsIgnoreCase("y"))
			{
				menuItem.setType(Constants.TYPE_IS_MENU);
				//Menu subMenu=new Menu();
				UserInteractor.getUserInput(menuItem.menu,menuitemLabel);
			}
			else
			{
				menuItem.setType(0);
			}
			menu.getMenuItems().add(menuItem);
			
		}
		MenuItem menuBack=new MenuItem();
		menuBack.setLabel("Back");
		menuBack.setType(Constants.TYPE_IS_BACK);
		menu.getMenuItems().add(menuBack);
		
		
	}
	
	public static boolean isInputValid(String input)
	{
		boolean status=true;
		if(input.length()>1 || input.codePointAt(0)<48 || input.codePointAt(0)>57)
		{
			status=false;
		}
		
		return status;
	}

}