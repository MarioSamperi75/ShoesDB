package se.nackademin.model;

import java.sql.Date;
import java.util.List;

public class Orders {
    int id;
    Date date;
    private List<Shoes> shoesList;
    //------------------------------------------

    public Orders() {}

    public Orders(int id, Date date) {
        this.id = id;
        this.date = date;
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
}
