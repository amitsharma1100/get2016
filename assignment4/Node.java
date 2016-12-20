package session4.assignment1;

/**
 * 
 * @author Amit
 *
 */
public class Node {

	int NodeNumber;
	int type;
	Profile profile;

	public Node() {
		this.profile = new Profile();
	}

	public Node(int NodeNumber, int type) {
		this.NodeNumber = NodeNumber;
		this.type = type;
		this.profile = new Profile();
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

	/**
	 * 
	 * @param node--compares this node with the node for which the method is called 
	 * @return
	 */
	public boolean equals(Node node) {
		boolean status = false;
		{
			if (this.NodeNumber == node.NodeNumber
					&& this.type == node.type
					&& this.getProfile().getName()
							.equals(node.getProfile().getName())
					&& this.getProfile().place.equals(node.getProfile()
							.getPlace())) {
				status = true;
			}
		}
		return status;

	}
}