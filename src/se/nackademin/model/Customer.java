package se.nackademin.model;

import java.util.List;

public class Customer {
    int id;
    private String firstname;
    private String lastname;
    private String password;
    private City city;
    private List<Orders> OrdersList;
    //------------------------------------------

    public Customer() {}

    public Customer(int id, String firstname, String lastname, String password) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
    }

    //------------------------------------------


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Orders> getOrdersList() {
        return OrdersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        OrdersList = ordersList;
    }
}
