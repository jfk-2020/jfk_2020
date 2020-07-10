package com.jfk.bookstore.domain;

public class CookBook extends Book {

    public CookBook(String name, String description, double price, String barCode) {
        super(name, description, price, barCode);
    }

    @Override
    public BookType type() {
        return BookType.COOKBOOK;
    }

}
