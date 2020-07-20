package com.jfk.lesson17BookStore;

public enum BookTypes {
    COOKBOOK,
    ENCYCLOPEDIA,
    DICTIONARY,
    MATH,
    PHILOSOPHY;

    public static BookTypes getType(String type) throws BookTypeNotFound{
        BookTypes bookTypes = null;

        if (type.equalsIgnoreCase("CookBook")) {
            bookTypes = COOKBOOK;
        } else if (type.equalsIgnoreCase("Encycopedia")) {
            bookTypes = ENCYCLOPEDIA;
        } else if (type.equalsIgnoreCase("Dictionary")) {
            bookTypes = DICTIONARY;
        } else if (type.equalsIgnoreCase("Math")){
            bookTypes = MATH;
        } else if (type.equalsIgnoreCase("Philosophy")) {
            bookTypes = PHILOSOPHY;
        } else {
            throw new BookTypeNotFound();
        }

        return bookTypes;
    }
}
