package assignment1;

/**
 * POJO to store book titles
 * 
 * @author Amit
 *
 */
public class Books {

	private String title;

	/**
	 * parameterized constructor
	 * 
	 * @param title
	 *            : string
	 */
	public Books(String title) {
		super();
		this.title = title;
	}

	/**
	 * Unparameterized constructor
	 */
	public Books() {
	}

	/**
	 * method to get title
	 * 
	 * @return : String
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * method to set title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

}
