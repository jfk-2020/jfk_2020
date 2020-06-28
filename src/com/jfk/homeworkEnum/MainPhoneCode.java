package com.jfk.homeworkEnum;

public class MainPhoneCode {
    public static void main(String[] args) {
        PhoneCode countryPhoneCode = PhoneCode.findByPhoneCode("+375");
        if (countryPhoneCode == null) {
            System.out.println("Country code is not found");
        } else {
            System.out.println(countryPhoneCode.countryName);
        }

    }
}
