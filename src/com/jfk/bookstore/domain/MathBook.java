package com.jfk.bookstore.domain;

public class MathBook extends Book {

    public MathBook(String name, String description, double price, String barCode) {
        super(name, description, price, barCode);
    }

    @Override
    public BookType type() {
        return BookType.MATH;
    }
}
