package com.jfk.bookStore;

public class Cookbook extends Book{

    public Cookbook(String name, String description, double price) {
        super(name, description, price);
    }

    @Override
    public String getType() {
        return "CookingBooks";
    }
}
