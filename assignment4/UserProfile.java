package session4.aassignment1;

public class UserProfile extends Profile{
	
	private int age;
	private int friendsCount;
	
	public UserProfile() {
		super();
	}
	
	public UserProfile(String name,String place,int type,int age) {
		super(name,place,type);
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getFriendsCount() {
		return friendsCount;
	}
	public void setFriendsCount(int friendsCount) {
		this.friendsCount = friendsCount;
	}

}
