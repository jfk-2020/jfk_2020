package com.jfk.lesson17BookStore;

public class BookDemo {
    public static void main(String[] args) {
        String dir = "";
        BookLoader bookLoader = new BookLoader("D:\\Java", "\\Books.txt");
        //bookLoader.booksSave();
        bookLoader.booksLoad();
    }
}
