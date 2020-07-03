package com.jfk.bookstore.domain;

public class MathBook extends Book {

    public MathBook(String name, String description, double price) {
        super(name, description, price);
    }

    @Override
    public BookType type() {
        return BookType.MATH;
    }
}
