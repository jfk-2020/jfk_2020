package com.jfk.bookstore;

public class BookNotFoundException extends RuntimeException {

    private String message;

    public BookNotFoundException(String message) {

        super(message);
    }
}
