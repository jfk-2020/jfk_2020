package com.jfk.enumerations;

/**
 * @author William Arustamyan
 */


public enum Country {
    ARM("AM", "051"),
    RUS("RU", "643"),
    USA("US", "840"),
    CHN("CN", "156");

    private final String shortCode;
    private final String numericCode;

    Country(String shortCode, String numericCode) {
        this.shortCode = shortCode;
        this.numericCode = numericCode;
    }

    public String shortCode() {
        return this.shortCode;
    }

    public String numericCode() {
        return this.numericCode;
    }

    public String toString() {
        return shortCode + " : " + numericCode;
    }

    public static Country findByShortCode(String shortCode) {
        for (int i = 0; i < Country.values().length; i++) {
            if (Country.values()[i].shortCode == shortCode) {
                return Country.values()[i];
            }
        }
        return null;
    }
}
