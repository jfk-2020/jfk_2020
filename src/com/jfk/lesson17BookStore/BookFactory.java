package com.jfk.lesson17BookStore;

public class BookFactory {
    private BookFactory() {}
    public Book createBook(BookTypes bookTypes, String name, String description, int price) {
        if (bookTypes == BookTypes.COOKBOOK) {
            return new Cookbook(name, description, price);
        } else if (bookTypes == BookTypes.DICTIONARY) {
            return new Dictionary(name, description, price);
        } else if (bookTypes == BookTypes.ENCYCLOPEDIA) {
            return new Encyclopedia(name, description, price);
        } else if (bookTypes == BookTypes.MATH) {
            return new Math(name, description, price);
        } else if (bookTypes == BookTypes.PHILOSOPHY) {
            return new Philosophy(name, description, price);
        }
        return  null;
    }
}
