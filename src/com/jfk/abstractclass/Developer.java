package com.jfk.abstractclass;

/**
 * @author William Arustamyan
 */

public class Developer extends AbstractEmployee {

    private String usedLanguage;


    public Developer(String usedLanguage, String name, String address, int age) {
        super(name, address, age);
        this.usedLanguage = usedLanguage;
    }

    public String getProfession() {
        return "Developer";
    }

    @Override
    public String gender() {
        return "male";
    }
}
