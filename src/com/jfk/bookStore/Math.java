package com.jfk.bookStore;

public class Math extends Book {
    public Math(String name, String description, double price) {
        super(name, description, price);
    }

    @Override
    public String getType() {
        return "MathBooks";
    }

}
