package com.jfk.homeworkEnum;

import com.jfk.bookstore.domain.MathBook;
import com.jfk.homeworkEnum.exceptions.*;

public enum PhoneCode {
    ARMENIA("ARM", "55"),
    GEORGIA("GEO", "13"),
    ESTONIA("ESTONIA", "78");

    public String countryName;
    public String phoneCode;

    PhoneCode(String countryName, String phoneCode) {
        this.countryName = countryName;
        this.phoneCode = phoneCode;
    }

    public static PhoneCode findByPhoneCode(String phoneCode) throws PhoneNumberNotFoundException {
        for (int i = 0; i < PhoneCode.values().length; i++) {
            if (PhoneCode.values()[i].phoneCode.equals(phoneCode)) {
                return PhoneCode.values()[i];
            }
        }
        throw new PhoneNumberNotFoundException("Phone number not found");
    }
}