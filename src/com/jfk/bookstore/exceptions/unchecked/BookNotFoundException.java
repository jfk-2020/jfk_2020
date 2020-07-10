package com.jfk.bookstore.exceptions.unchecked;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(String message) {
        super(message);
    }
}
