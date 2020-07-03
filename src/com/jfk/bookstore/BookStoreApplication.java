package com.jfk.bookstore;

import com.jfk.bookstore.domain.BookType;
import com.jfk.bookstore.domain.Dictionary;
import com.jfk.bookstore.domain.MathBook;
import com.jfk.bookstore.domain.CookBook;

public class BookStoreApplication {

    public static void main(String[] args) {

        BookStore store = new BookStore(10);
        store.addBook(new Dictionary("Dictionary", "Dictionary book", 100));
        store.addBook(new Dictionary("Dictionary 1", "Dictionary 1 book", 200));
        store.addBook(new MathBook("Math", "Math book", 15.2));
        store.addBook(new MathBook("Math1", "Math book1", 20.3));
        store.addBook(new MathBook("Math2", "Math book2", 30.5));
        store.addBook(new CookBook("Armenian Cuisine", "Armenian traditional meals", 15));
        store.addBook(new CookBook("Georgian Cuisine", "Georgian traditional meals", 20));

        //System.out.println(Arrays.toString(store.findAllByType(BookType.DICTIONARY)));
        //System.out.println(Arrays.toString(store.findAllByType(BookType.COOKBOOK)));
        double priceSummary = store.priceSummary(BookType.DICTIONARY);
        System.out.println("The sum of all the books price is: " + priceSummary);
        double maxPrice = store.maxPrice(BookType.DICTIONARY);
        System.out.println("The books max price is: " + maxPrice);
        double wholePriceSummary = store.priceSummary();
        System.out.println("The sum of the all books is: " + wholePriceSummary);
        boolean bookName = store.containsBookByName("Math");
        System.out.println(bookName);


    }
}
