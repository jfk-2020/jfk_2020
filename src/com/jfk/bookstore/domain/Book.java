package com.jfk.bookstore.domain;

/**
 * @author William Arustamyan
 */

public abstract class Book {

    protected String barCode;

    protected String name;
    protected String description;
    protected double price;

    protected Book(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public abstract BookType type();

    public String getBarCode() {
        return this.barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public double price() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "barCode='" + barCode + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
