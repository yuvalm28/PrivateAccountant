package com.example.privateaccountant.ui;
import java.io.Serializable;
public class Product implements Serializable {

    String name, description;
    int price;

    public Product(String name, String description, int price){
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }
    public int getPrice()
    {
        return price;
    }

}
