package com.Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author Amit
 * Singeleton design pattern implementation 
 * Creates a single object of the connection
 *
 */
public class ConnectionFactory {

    private static final ConnectionFactory CONNECTION_FACTORY = new ConnectionFactory();
  
	private static Connection connection;

    /**
     * @return the connection
     */
    private static Connection getConnection() {
        return connection;
    }

    /**
     * @param connection
     *            the connection to set
     */
    public void setConnection(Connection connection) {
        ConnectionFactory.connection = connection;
    }

    /**
     * private constructor
     * creates the connection object 
     * called only once
     */
    private ConnectionFactory() {
        try {
           Class.forName("com.mysql.jdbc.Driver");
            setConnection(DriverManager.getConnection("jdbc:mysql://localhost/cardekho", "root", "root"));
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 
     * @return the connection object
     */
    public static Connection getConnectionObject() {
    	Connection connection=getConnection();
    	if(connection==null){
    		connection=new ConnectionFactory().connection;
    	}
        return connection;
    }
}