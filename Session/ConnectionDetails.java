package assignment1;

/**
 * class for connection details
 * 
 * @author Amit
 *
 */
public class ConnectionDetails {

	private static final String USER_ID = "root";
	private static final String PASSWORD = "root";
	private static final String HOST = "jdbc:mysql://192.168.100.130:3306/";
	private static final String DB_NAME = "LIS";
	private static final String URL = HOST + DB_NAME;

	public static String getUserId() {
		return USER_ID;
	}

	public static String getPassword() {
		return PASSWORD;
	}

	public static String getHost() {
		return HOST;
	}

	public static String getDbName() {
		return DB_NAME;
	}

	public static String getUrl() {
		return URL;
	}

}
