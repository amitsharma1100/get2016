package com.angular;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


/**
 * Restful Service class to access customer data 
 * @author Amit
 *
 */
@
Path("/customers")
public class CustomerService {
    CustomerFacade customerFacade = new CustomerFacade();

    /**
     * method to get customer data
     * @return-all customers data in the form of a json response
     */
    @
    GET@ Produces(MediaType.APPLICATION_JSON)
    public Response getAllCustomers() {
        ArrayList < CustomerVO > customerList = (ArrayList < CustomerVO > ) customerFacade.getAllCustomers();
        GenericEntity < ArrayList < CustomerVO >> generic = new GenericEntity < ArrayList < CustomerVO >> (
            customerList) {};
        // Sending the response
        return Response.status(200).entity(generic).build();
    }

    /**
     * inserts the data of a customer 
     * @param customerVO-the data of the customer in form of json
     * @return-status code of the add query
     */
    @
    POST@ Consumes(MediaType.APPLICATION_JSON)
    public Response addCustomer(CustomerVO customerVO) {
        boolean flag = customerFacade.addCustomer(customerVO);
        if (flag == true)
            return Response.status(201).build();
        else
            return Response.status(409).build();
    }
}