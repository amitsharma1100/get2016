package assignment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * class to manage the connection establishment
 * 
 * @author Amit
 *
 */
public class ConnectionManager {

	private static Connection connection;

	/**
	 * method to get connection
	 * 
	 * @return : Connection -> established connection
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static Connection getConnection() throws ClassNotFoundException,
			SQLException {
		if (ConnectionManager.connection == null) {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(
					ConnectionDetails.getUrl(), ConnectionDetails.getUserId(),
					ConnectionDetails.getPassword());
			if (connection != null) {
				return connection;
			} else {
				return ConnectionManager.getConnection();
			}
		} else {
			return connection;
		}

	}

}
