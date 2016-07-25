package session5.assignment1;

public class MenuItem {

	private String label;
	private int type;
	Menu menu;
	
	
	public MenuItem(String label, int type) {
		this.label = label;
		this.type = type;
		this.menu=new Menu();
	}
	
	public MenuItem() {
		this.menu=new Menu();
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
}