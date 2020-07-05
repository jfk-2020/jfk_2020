package com.jfk.bookstore.domain;

public abstract class Book {

    protected String name;
    protected String description;
    protected double price;

    protected Book(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public abstract BookType type();

    public double price() {
        return this.price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
