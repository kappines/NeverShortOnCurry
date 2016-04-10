package com.example.zombisou.nevershortoncurry;

import java.util.Date;

/**
 * Created by Zombisou on 10-Apr-16.
 */
public class Expense {

    private String name;
    private double price;
    private String user; //Todo: change into a user class?
    private Date date;

    public Expense(String name, double price, String user, Date date) {
        this.name = name;
        this.price = price;
        this.user = user;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
