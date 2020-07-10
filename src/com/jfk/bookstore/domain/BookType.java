package com.jfk.bookstore.domain;

import EnumExamples.Gender;

/**
 * @author William Arustamyan
 */

public enum BookType {

    MATH("Algebra"),
    COOKBOOK("Hot dishes"),
    DICTIONARY("Armenia-English"),
    PHILOSOPHY("Aristotelis");

    private String name;

    BookType(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static BookType findByName(String name) {
        for (int i = 0; i < BookType.values().length; i++) {
            if (BookType.values()[i].name == name)
                return BookType.values()[i];
        }
        return  null;
    }
}
