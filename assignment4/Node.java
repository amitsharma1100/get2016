package session4.aassignment1;


public class Node {

	 int NodeNumber;
	 int type;
	 Profile profile;
	

	public Node() {
		this.profile=new Profile();
	}

	public Node(int NodeNumber, int type) {
		this.NodeNumber = NodeNumber;
		this.type = type;
		this.profile=new Profile();
	}

	public int getNodeNumber() {
		return NodeNumber;
	}

	public void setNodeNumber(int nodeNumber) {
		NodeNumber = nodeNumber;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

}
