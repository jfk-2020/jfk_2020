package com.jfk.bookStore;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BookStoreApp bookStoreApp = new BookStoreApp(1000);

        Book dictionary = new Dictionary("English-Armenian", "English-Armenian dictionary", 15.5);
        Book cookBook = new Cookbook("Cookbook", "Cookbook book", 10.5);
        Book second = new Cookbook("Cookbook - 1", "Cookbook book - 1", 11.5);
        bookStoreApp.addBook(dictionary);
        bookStoreApp.addBook(cookBook);
        bookStoreApp.addBook(second);
        Book[] booksByType = bookStoreApp.getBooksByType(cookBook.getType());
        System.out.println(Arrays.toString(booksByType));
    }
}
