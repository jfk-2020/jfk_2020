package com.jfk.Lesson17_BookStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookStore {
    private Map<BookTypes, BookShelves> store = new HashMap<BookTypes, BookShelves>();

    public BookStore() {
        for (BookTypes bookTypes: BookTypes.values()) {
            store.put(bookTypes, new BookShelves());
        }
    }
    public void add(Book book) {
        BookShelves bookShelves = store.get(book.getType());
        bookShelves.add(book);
    }

    public void remove(Book book) {
        BookShelves bookShelves = store.get(book.getType());
        bookShelves.remove(book);
    }

    public List<Book> getBooksByName(String name) {
        List<Book> books = new ArrayList<>();

        for (Map.Entry<BookTypes, BookShelves> bookShelvesEntry : store.entrySet()) {
            for (Book book : bookShelvesEntry.getValue().getStore()) {
                if (book.getName().equalsIgnoreCase(name)) {
                    books.add(book);
                }
            }
        }
        if (books.size() == 0) {
            throw new BookNotFoundException();
        }

        return books;
    }

    public List<Book> getBooksByType(BookTypes bookTypes) {
        List<Book> books = new ArrayList<>();
        for (Book book: books) {
            if (book.getType() == bookTypes) {
                books.add(book);
            }
        }
        return books;
    }
}
