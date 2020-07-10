package com.jfk.bookstore.domain;

public class PhilosophyBook extends Book {


    public PhilosophyBook(String name, String description, double price) {
        super(name, description, price);
    }

    @Override
    public BookType type() {
        return BookType.PHILOSOPHY;
    }
}

