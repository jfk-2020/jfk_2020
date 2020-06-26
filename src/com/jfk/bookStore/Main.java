package com.jfk.bookStore;

public class Main {
    public static void main(String[] args) {
        BookStoreApp bookStoreApp = new BookStoreApp();

        Dictionary dictionary = new Dictionary("English-Armenian", "English-Armenian dictionary", 15.5);
        bookStoreApp.addBook(dictionary);

    }
}
