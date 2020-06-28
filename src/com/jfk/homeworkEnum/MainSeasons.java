package com.jfk.homeworkEnum;

public class MainSeasons {
    public static void main(String[] args) {
        Seasons seasons = Seasons.findByCharacter("Snowy");
        if (seasons == null) {
            System.out.println("Season is not found");
        } else {
            System.out.println(seasons.character);
        }
    }
}
