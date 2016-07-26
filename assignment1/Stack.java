package session5.assignment1;

public class Stack {
	 static Menu[] menu;
	 static int pointer;
	
	public Menu[] getMenu() {
		return menu;
	}

	public void setMenu(Menu[] menu) {
		Stack.menu = menu;
	}

	public Stack()
	{
		Stack.menu=new Menu[10];
		Stack.pointer=-1;
		for(int index=0;index<10;index++)
		{
			Stack.menu[index]=new Menu();
		}
	}

}
