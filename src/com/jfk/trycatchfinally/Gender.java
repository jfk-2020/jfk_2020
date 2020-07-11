package com.jfk.trycatchfinally;

public enum Gender {


    Male, Female;


    public static Gender findGender(String name) throws Exception{
        for (int i = 0; i < Gender.values().length; i++) {
            if (name.equalsIgnoreCase(Gender.values()[i].name())) {
                return Gender.values()[i];
            }
        }
        throw new RuntimeException("Gender with name : {" + name + "} not found");
    }
}
