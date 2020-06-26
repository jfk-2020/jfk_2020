package com.jfk.enumerations;

import java.util.Arrays;

/**
 * @author William Arustamyan
 */

public class EnumerationApplication {


    public static void main(String[] args) {

        Country country = Country.ARM;
//        System.out.println(country.ordinal());

        System.out.println(Country.CHN.ordinal());
        System.out.println(country.name());
        System.out.println(Arrays.toString(Country.values()));


        System.out.println(country);
//        System.out.println(enumExample.ordinal());

        for (int i = 0; i < Country.values().length; i++) {
            System.out.println(Country.values()[i].name());
        }
    }
}
