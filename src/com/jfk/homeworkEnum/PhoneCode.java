package com.jfk.homeworkEnum;

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

    public static PhoneCode findByPhoneCode(String phoneCode) {
        for (int i = 0; i < PhoneCode.values().length; i++) {
            if (PhoneCode.values()[i].phoneCode.equals(phoneCode)) {
                return PhoneCode.values()[i];
            }
        }
        return null;
    }
}