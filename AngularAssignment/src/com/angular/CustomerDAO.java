package com.angular;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Amit
 * This class handles the database related operation
 *
 */
public class CustomerDAO {

    /**
     * get the list of all customers
     * @return-the list of all customers
     */
    List < CustomerVO > getAllCustomers() {

            //connection object
            Connection connection = ConnectionFactory.getConnectionObject();

            //customer list declared
            List < CustomerVO > customerVOList = new ArrayList < CustomerVO > ();

            //create select query
            String query = "SELECT * FROM customer";
            ResultSet resultSet = null;
            try {

                //create statement to be executed and execute query
                Statement statement = connection.createStatement();
                resultSet = statement.executeQuery(query);
                if (resultSet != null) {

                    //parse all the results
                    while (resultSet.next()) {
                        //create a new customerVO for each row
                        CustomerVO customerVO = new CustomerVO();

                        //set the values of the attributes
                        customerVO.setId(resultSet.getInt("customer_id"));
                        customerVO.setFirstName(resultSet.getString("first_name"));
                        customerVO.setLastName(resultSet.getString("last_name"));
                        customerVO.setGender(resultSet.getString("gender"));
                        customerVO.setEmail(resultSet.getString("email"));
                        customerVO.setCity(resultSet.getString("city"));
                        customerVO.setCountry(resultSet.getString("country"));
                        customerVO.setOrders(resultSet.getInt("orders"));

                        //add into list
                        customerVOList.add(customerVO);
                    }
                }
            } catch (SQLException e) {
                System.out.println("Error" + e);
            }

            //return the list
            return customerVOList;
        }
        /**
         * method to enter the data of a new customer into the database
         * @param customerVO-customer object that holds the data of the customer
         * @return-true if the customer is successfully added
         */
        @
    SuppressWarnings("finally")
    boolean addCustomer(CustomerVO customerVO) {
        //connection object
        Connection connection = ConnectionFactory.getConnectionObject();
        boolean status = true;

        //create select query
        String query = "INSERT INTO customer (first_name,last_name,gender,email,city,country,orders) VALUES (?,?,?,?,?,?,?)";
        try {

            //create statement to be executed
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, customerVO.getFirstName());
            preparedStatement.setString(2, customerVO.getLastName());
            preparedStatement.setString(3, customerVO.getGender());
            preparedStatement.setString(4, customerVO.getEmail());
            preparedStatement.setString(5, customerVO.getCity());
            preparedStatement.setString(6, customerVO.getCountry());
            preparedStatement.setInt(7, customerVO.getOrders());

            //execute query
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected == 0) {
                status = false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            status = false;
        } finally {
            return status;
        }
    }
}