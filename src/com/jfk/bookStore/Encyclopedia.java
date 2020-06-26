package com.jfk.bookStore;

public class Encyclopedia extends Book {
    public Encyclopedia(String name, String description, double price) {
        super(name, description, price);
    }

    @Override
    public String getType() {
        return "EncyclopediaBooks";
    }
}
