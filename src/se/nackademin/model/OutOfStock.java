package se.nackademin.model;

import java.util.Date;

public class OutOfStock {
    int id;
    Date date;
    Shoes shoes;

    //------------------------------------------

    public OutOfStock() {}

    public OutOfStock(int id, Date date, Shoes shoes) {
        this.id = id;
        this.date = date;
        this.shoes = shoes;
    }

    //------------------------------------------


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }
}
