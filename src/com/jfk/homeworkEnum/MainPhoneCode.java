package com.jfk.homeworkEnum;

import com.jfk.homeworkEnum.exceptions.PhoneNumberNotFoundException;

public class MainPhoneCode {
    public static void main(String[] args) throws PhoneNumberNotFoundException {
        PhoneCode countryPhoneCode = PhoneCode.findByPhoneCode("+375");
        if (countryPhoneCode == null) {
            System.out.println("Country code is not found");
        } else {
            System.out.println("Phone number not found");
        }
    }
}