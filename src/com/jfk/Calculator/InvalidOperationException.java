package com.jfk.Calculator;

public class InvalidOperationException extends RuntimeException {

    private String message;

    public InvalidOperationException(String message) {
        //this.message = message;
        super(message);
    }

//    public String getMessage(){
//        return this.message;
//    }
}
