package session5.assignment1;

import java.util.Scanner;

public class UserInteractor {
	
	public static void getUserInput(Menu menu,String menuLabel)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no of menu items for "+menuLabel);
		int totalMenuItems=scanner.nextInt();
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

}