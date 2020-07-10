package com.jfk.bookstore.domain;

public class Dictionary extends Book {

    public Dictionary(String name, String description, double price, String barCode) {
        super(name, description, price, barCode);
    }

    @Override
    public BookType type() {
        return BookType.DICTIONARY;
    }

}
