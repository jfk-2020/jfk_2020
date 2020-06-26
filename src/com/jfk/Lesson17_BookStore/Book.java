package com.jfk.Lesson17_BookStore;

public abstract class Book {
    private String name;
    private String description;
    private int price;
    private BookTypes type;

    public Book(String name, String description, int price, BookTypes type) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public BookTypes getType() {
        return type;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
