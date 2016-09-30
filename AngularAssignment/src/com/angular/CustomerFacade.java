package com.angular;

import java.util.List;

/**
 * Facade to map the service requests to the DAO layer
 * @author Amit
 *
 */
public class CustomerFacade {

    CustomerDAO customerDAO = new CustomerDAO();

    /**
     * get the list of all customers
     * @return-the list of all customers
     */
    List < CustomerVO > getAllCustomers() {
            return customerDAO.getAllCustomers();
        }
        /**
         * method to enter the data of a new customer into the database
         * @param customerVO-customer object that holds the data of the customer
         * @return-true if the customer is successfully added
         */
    boolean addCustomer(CustomerVO customerVO) {
        return customerDAO.addCustomer(customerVO);
    }
}