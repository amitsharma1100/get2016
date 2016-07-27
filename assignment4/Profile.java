package session4.aassignment1;

public class Profile {
	
	 String name;
	 String place;
	 int type;
	public Profile() {
		
	}
	public  Profile(String name,String place,int type) {
		this.name=name;
		this.place=place;
		this.type=type;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}

}
