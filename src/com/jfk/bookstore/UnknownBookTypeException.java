package com.jfk.bookstore;

public class UnknownBookTypeException extends RuntimeException {


    public UnknownBookTypeException(String message) {
        super(message);
    }

}
