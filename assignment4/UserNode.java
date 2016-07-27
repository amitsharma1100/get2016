package session4.aassignment1;

public class UserNode extends Node {

	private UserProfile userProfile;

	public UserNode() {
		super();
		this.userProfile = new UserProfile();
	}

	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}

}
