package com.jfk.Lesson17_BookStore;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private List<Book> store = new ArrayList<Book>();

    public void add(Book book) {
        store.add(book);
    }
    public void remove(Book book) {
        store.remove(book);
    }
    public List<Book> getBookByType(BookTypes bookTypes) {
        List<Book> books = new ArrayList<>();
        for (Book book: books) {
            if (book.getType() == bookTypes) {
                books.add(book);
            }
        }
        return books;
    }
}
