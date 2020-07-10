package com.jfk.bookstore;

import com.jfk.bookstore.domain.*;

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
        BookStore store = new BookStore(20);
        store.addBook(new Dictionary("Dictionary", "Dictionary book", 100));
//        store.addBook(new Dictionary("Dictionary 1", "Dictionary 1 book", 200));
//        store.addBook(new MathBook("Math", "Math book", 112));
//        store.addBook(new MathBook("Math1", "Math book1", 99.99));
//        store.addBook(new MathBook("Math2", "Math book2", 80.9));
//        store.addBook(new CookBook("Armenian Cuisine", "Armenian traditional meals", 300));
//        store.addBook(new CookBook("Russian Cuisine", "Russian traditional meals", 150));

        //System.out.println(Arrays.toString(store.findAllByType(BookType.DICTIONARY)));
        //System.out.println(Arrays.toString(store.findAllByType(BookType.COOKBOOK)));
//        double priceSummary = store.priceSummary(BookType.DICTIONARY);
//        System.out.println("The total sum of all the books price is : " + priceSummary);
//
//        double maxPrice = store.maxPrice(BookType.DICTIONARY);
//        System.out.println("The book's max price is : " + maxPrice);

//        double wholePriceSummary = store.priceSummary();
//        System.out.println("The sum of the all books is : " + wholePriceSummary);

//        boolean bookName = store.containsBookByName("Math");
//        System.out.println(bookName);

//        Book[] booksInPriceRange = store.booksInPriceRange(150.3, 550.5);
//        System.out.println(Arrays.toString(booksInPriceRange));
//
//        Book[] booksLessThan = store.booksLessThan(100);
//        System.out.println(Arrays.toString(booksLessThan));
//
        Book[] booksGreaterThan = store.booksGreaterThan(90.5);
        System.out.println(Arrays.toString(booksGreaterThan));

        boolean removeBookByName = store.removeBookByName("Dictionary 1");
        System.out.println("This book has been removed: " + removeBookByName);
       // System.out.println(Arrays.toString(store.findAllByType(BookType.DICTIONARY)));
//        double priceSummary = store.priceSummary(BookType.DICTIONARY);
//        System.out.println(priceSummary);
    }
}
