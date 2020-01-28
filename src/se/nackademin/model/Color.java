package se.nackademin.model;

public class Color {
    int id;
    String name;

    //------------------------------------------

    public Color() {}

    public Color(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //------------------------------------------


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
