package com.jfk.homeworkEnum.exceptions;

public class PhoneNumberNotFoundException extends IllegalArgumentException {
    public PhoneNumberNotFoundException(String message) {
        super(message);
    }
}
