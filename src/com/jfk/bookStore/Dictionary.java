package com.jfk.bookStore;

public class Dictionary extends Book{

    public Dictionary(String name, String description, double price) {
        super(name, description, price);
    }

    @Override
    public String getType() {
        return "DictionaryBooks";
    }
}
