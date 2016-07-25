package session5.assignment1;

public class MenuDriver {
	
	public static void main(String[] args) {
	//UserInteractor userInteractor=new UserInteractor();
	Menu menu=new Menu();
	UserInteractor.getUserInput(menu,"Main Menu");
	Stack stack=new Stack();
	Stack.pointer=0;
	Stack.menu[Stack.pointer]=menu;
	new Display().display(menu,1);
		
		
	}

}