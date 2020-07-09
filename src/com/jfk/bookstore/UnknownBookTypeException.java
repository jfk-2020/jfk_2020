package com.jfk.bookstore;

public class UnknownBookTypeException extends RuntimeException {

    private String message;

    public UnknownBookTypeException(String message) {
        super(message);
    }
}
