package com.jfk.bookstore.domain;

/**
 * @author William Arustamyan
 */

public class CookBook extends Book {

    public CookBook(String name, String description, double price) {
        super(name, description, price);
    }

    @Override
    public BookType type() {
        return BookType.COOKBOOK;
    }
}
