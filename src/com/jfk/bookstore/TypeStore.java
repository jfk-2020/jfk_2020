package com.jfk.bookstore;

import com.jfk.bookstore.domain.Book;
import com.jfk.bookstore.domain.BookType;

/**
 * @author William Arustamyan
 */

public class TypeStore {

    private final BookType type;
    private final Book[] books;
    private int currentIndex;

    public TypeStore(BookType type, int storeSize) {
        this.type = type;
        this.books = new Book[storeSize];
        this.currentIndex = 0;
    }

    public BookType getType() {
        return type;
    }

    public Book[] getBooks() {
        return books;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public void increment() {
        this.currentIndex++;
    }

    public void decrement() {
        this.currentIndex--;
    }
}
