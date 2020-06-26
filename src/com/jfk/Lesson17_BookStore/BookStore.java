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
}
