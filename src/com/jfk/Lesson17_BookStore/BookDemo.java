package com.jfk.Lesson17_BookStore;

public class BookDemo {
    public static void main(String[] args) {
        String dir = "";
        BookLoader bookLoader = new BookLoader("D:\\Java", "\\Books.txt");
        //bookLoader.booksSave();
        bookLoader.booksLoad();
    }
}
