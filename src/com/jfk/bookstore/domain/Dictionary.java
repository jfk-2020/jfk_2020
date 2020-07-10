package com.jfk.bookstore.domain;

/**
 * @author William Arustamyan
 */

public class Dictionary extends Book {

    private String language;

    public Dictionary(String name, String description, double price, String lan) {
        super(name, description, price);
        language = lan;
    }

    @Override
    public BookType type() {
        return BookType.DICTIONARY;
    }

    public String getLanguage() {
        return language;
    }
}
