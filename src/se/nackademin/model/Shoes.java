package se.nackademin.model;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class Shoes {
    int id;
    String model;
    String size;
    int price;
    int storage;
    Brand brand;
    Color color;
    private List<Category> categoryList;


    //------------------------------------------

    public Shoes() {}

    public Shoes(int id, String model, String size, int price, int storage) {
        this.id = id;
        this.model = model;
        this.size = size;
        this.price = price;
        this.storage = storage;

    }

    //------------------------------------------


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public String getCategoryListToString() {
            String text="";
            for (Category c: categoryList)
                text += c.getName() + " ";
            return text;
          }


    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public void print() {
        System.out.println(brand.getName() + " " + model + " " + size + " " + color.getName() + " " + price + " " + getCategoryListToString());
    }

}

