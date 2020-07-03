package com.jfk.bookstore;

import com.jfk.bookstore.domain.Book;
import com.jfk.bookstore.domain.BookType;

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
        Book[] books = findAllByType(bookType);
        if (books == null) return -1;
        double max = 0.0;
        for (int i = 0; i < bookCount(bookType); i++) {
            if (max <= books[i].price()) {
                max = books[i].price();
            }
        }
        return max;
    }

    public double priceSummary() {
        double sum = 0;
        for (int i = 0; i < BookType.values().length; i++) {
            double x = priceSummary(BookType.values()[i]);
            if (x != -1) {
                sum += x;
            }
        }
        return sum;
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

    public int bookCount(BookType bookType) {
        Book[] books = findAllByType(bookType);
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
        for (int i = 0; i < stores.length; i++) {
            if (stores[i].getBooks() != null) {
                for (int j = 0; j < bookCount(stores[i].getType()); j++) {
                    if (stores[i].getBooks()[j].getName().contains(bookName)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public double booksInPriceRange(double from, double to) {
        for(int i = 0; i < stores.length; i++){
            for(int k = 0; k < bookCount(stores[i].getType()); k++){
                if (stores[i].getBooks()[k].price() <= stores.length){

                }
            }
        }
        return from;
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
