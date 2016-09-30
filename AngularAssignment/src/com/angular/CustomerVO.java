package com.angular;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * POJO class for customer
 * @author Amit
 * Class for holding attributes of a customer 
 *
 */
@
XmlRootElement
public class CustomerVO {

    private int id;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private String city;
    private String country;
    private int orders;
    /**
     * method to get the customer id
     * @return int : customer id
     */
    public int getId() {
            return id;
        }
        /**
         * method to set customer id
         * @param id : integer to set as customer id
         */
    public void setId(int id) {
            this.id = id;
        }
        /**
         * method to get customer's first name
         * @return string : customer's first name
         */
    public String getFirstName() {
            return firstName;
        }
        /**
         * method to set customer's first name
         * @param firstName : string to set as customer's first name
         */
    public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        /**
         * method to get customer's last name
         * @return string : customer's last name
         */
    public String getLastName() {
            return lastName;
        }
        /**
         * method to set customer's last name
         * @param lastName : string to set as customer's last name
         */
    public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        /**
         * method to get customer's gender
         * @return string : customer's gender
         */
    public String getGender() {
            return gender;
        }
        /**
         * method to set customer's gender
         * @param gender : string to set as customer's gender
         */
    public void setGender(String gender) {
            this.gender = gender;
        }
        /**
         * method to get customer's email
         * @return string : customer's email
         */
    public String getEmail() {
            return email;
        }
        /**
         * method to set customer's email
         * @param email : string to set as customer's email
         */
    public void setEmail(String email) {
            this.email = email;
        }
        /**
         * method to get customer's city
         * @return string : customer's city
         */
    public String getCity() {
            return city;
        }
        /**
         * method to set customer's city
         * @param city : string to set as customer's city
         */
    public void setCity(String city) {
            this.city = city;
        }
        /**
         * method to get customer's country
         * @return string : customer's country
         */
    public String getCountry() {
            return country;
        }
        /**
         * method to set customer's country
         * @param country : string to set as customer's country
         */
    public void setCountry(String country) {
            this.country = country;
        }
        /**
         * method to get customer's orders
         * @return integer : customer's orders
         */
    public int getOrders() {
            return orders;
        }
        /**
         * method to set customer's orders
         * @param orders : string to set as customer's orders
         */
    public void setOrders(int orders) {
        this.orders = orders;
    }
}