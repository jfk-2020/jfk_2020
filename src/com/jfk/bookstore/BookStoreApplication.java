package com.jfk.bookstore;

import com.jfk.bookstore.domain.BookType;
import com.jfk.bookstore.domain.Dictionary;
import com.jfk.bookstore.domain.MathBook;

import java.util.Arrays;

/**
 * @author William Arustamyan
 */

public class BookStoreApplication {

    public static void main(String[] args) {


        //Create enum PhoneCode with code and country name
        //Create Seasons enum.
        //Create Gender enum.
        //Create CountryPhoneCode enum which will contains PhoneCode as field.
        /*All enums should have static method to find instance by field value. For
         * example find PhoneCode by country name static PhoneCode findByCountryName(String countryName)
          */



        //Add missing book type
        BookStore store = new BookStore(10);
        store.addBook(new Dictionary("Dictionary", "Dictionary book", 100));
        store.addBook(new Dictionary("Dictionary 1", "Dictionary 1 book", 200));
        store.addBook(new MathBook("Math", "Math book", 112));
        System.out.println(Arrays.toString(store.findAllByType(BookType.DICTIONARY)));
        double priceSummary = store.priceSummary(BookType.DICTIONARY);
        System.out.println(priceSummary);
    }
}
