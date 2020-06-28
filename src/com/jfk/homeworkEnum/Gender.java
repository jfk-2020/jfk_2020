package com.jfk.homeworkEnum;

public enum Gender {
    Male(0),
    Female(1);

    public int value;

    Gender(int value) {
        this.value = value;
    }

    public static Gender getGender(int value) {
        for (int i = 0; i < Gender.values().length; i++) {
            if (Gender.values()[i].value == value) {
                return Gender.values()[i];
            }
        }
        return null;
    }
}
