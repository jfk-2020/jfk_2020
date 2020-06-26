package com.jfk.bookStore;

public class Fiction extends Book {
    public Fiction(String name, String description, double price) {
        super(name, description, price);
    }

    @Override
    public String getType() {
        return "FictionBooks";
    }
}
