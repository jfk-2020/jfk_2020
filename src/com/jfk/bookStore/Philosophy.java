package com.jfk.bookStore;

public class Philosophy extends Book {
    public Philosophy(String name, String description, double price) {
        super(name, description, price);
    }

    @Override
    public String getType() {
        return "PhilosophyBooks";
    }
}
