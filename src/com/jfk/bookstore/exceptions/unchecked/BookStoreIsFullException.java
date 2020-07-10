package com.jfk.bookstore.exceptions.unchecked;

public class BookStoreIsFullException extends RuntimeException{

    public BookStoreIsFullException(String message) {
        super(message);
    }
}
