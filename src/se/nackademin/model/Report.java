package se.nackademin.model;

public class Report {
    int id;
    String comment;
    Customer customer;
    Shoes shoes;
    Grade grade;

    //------------------------------------------

    public Report() {}

    public Report(int id, String comment, Customer customer, Shoes shoes, Grade grade) {
        this.id = id;
        this.comment = comment;
        this.customer = customer;
        this.shoes = shoes;
        this.grade = grade;
    }

    //------------------------------------------


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

}
