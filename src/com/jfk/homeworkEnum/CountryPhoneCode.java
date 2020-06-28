package com.jfk.homeworkEnum;

public enum CountryPhoneCode {
    ARMENIA(PhoneCode.ARMENIA, "+374"),
    GEORGIA(PhoneCode.GEORGIA, "+995"),
    ESTONIA(PhoneCode.ESTONIA, "+372");

    public PhoneCode phoneCode;
    public String countryCode;

    CountryPhoneCode(PhoneCode phoneCode, String countryCode) {
        this.countryCode = countryCode;
        this.phoneCode = phoneCode;
    }
}
