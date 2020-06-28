package com.jfk.bookstore;

import com.jfk.bookstore.domain.Book;
import com.jfk.bookstore.domain.BookType;

/**
 * @author William Arustamyan
 */

public class BookStore {

    private final TypeStore[] stores;

    public BookStore(int size) {
        this.stores = new TypeStore[BookType.values().length];
        for (int i = 0; i < BookType.values().length; i++) {
            stores[i] = new TypeStore(BookType.values()[i], size);
        }
    }

    public void addBook(Book book) {
        BookType type = book.type();
        for (int i = 0; i < this.stores.length; i++) {
            if (this.stores[i].getType() == type) {
                this.stores[i].getBooks()[this.stores[i].getCurrentIndex()] = book;
                this.stores[i].increment();
            }
        }
    }

    public double maxPrice(BookType bookType) {
        //implement
        return -1;
    }

    public double priceSummary() {
        //implement this
        return -1;
    }

    public double priceSummary(BookType bookType) {
        //implement this
        return -1;
    }

    public int bookCount(BookType type) {
        //implement this
        return -1;
    }


    public Book[] findAllByType(BookType type) {
        for (int i = 0; i < this.stores.length; i++) {
            if (this.stores[i].getType() == type) {
                return this.stores[i].getBooks();
            }
        }
        return null;
    }
}
