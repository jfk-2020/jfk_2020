package com.jfk.bookstore.domain;

public abstract class Book {

    protected String name;
    protected String description;
    protected double price;
    public String barCode;

    protected Book(String name, String description, double price, String barCode) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.barCode = barCode;
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

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
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
