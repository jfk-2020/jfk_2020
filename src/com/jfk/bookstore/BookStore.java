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
        Book[] books = findAllByType(bookType);
        if (books == null) return -1;
        double summary = 0.0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                summary = summary + books[i].price();
            } else {
                break;
            }
        }
        return summary;
    }

    public int bookCount(BookType type) {
        Book[] books = findAllByType(type);
        if (books == null) return -1;
        int c = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                c++;
            } else {
                break;
            }
        }
        return c;
    }


    boolean containsBookByName(String bookName) {
        //implement this
        return false;
    }

    public Book[] booksInPriceRange(double from, double to) {
        return null;
    }

    public Book[] booksLessThan(double price) {
        return null;
    }

    public Book[] booksGreaterThan(double price) {
        return null;
    }

    public boolean removeBookByName(String bookName) {
        return false;
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
