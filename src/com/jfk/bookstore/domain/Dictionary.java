package com.jfk.bookstore.domain;

/**
 * @author William Arustamyan
 */

public class Dictionary extends Book {

    public Dictionary(String name, String description, double price) {
        super(name, description, price);
    }

    @Override
    public BookType type() {
        return BookType.DICTIONARY;
    }
}
