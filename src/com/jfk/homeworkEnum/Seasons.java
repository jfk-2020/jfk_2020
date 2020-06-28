package com.jfk.homeworkEnum;

public enum Seasons {
    SUMMER("Hot"),
    AUTUMN("Rainy"),
    WINTER("Cold"),
    SPRING("Warm");

    public String character;

    Seasons(String character) {
        this.character = character;
    }

    public static Seasons findByCharacter(String character) {
        for (int i = 0; i < Seasons.values().length; i++) {
            if (Seasons.values()[i].character.equals(character)) {
                return Seasons.values()[i];
            }
        }
        return null;
    }
}
