package com.jfk.bookstore;

import com.jfk.bookstore.domain.Book;
import com.jfk.bookstore.domain.BookType;

/**
 * @author William Arustamyan
 */

public class BookStore {

    private final TypeStore[] stores;
    private int bookNumber;

    public BookStore(int size) {
        this.stores = new TypeStore[BookType.values().length];
        for (int i = 0; i < BookType.values().length; i++) {
            stores[i] = new TypeStore(BookType.values()[i], size);
        }
    }

    public void addBook(Book book) {
        BookType type = book.type();
        for (int i = 0; i < this.stores.length; i++) {
            if (this.stores[i].getType() == null) {
                throw new BookNotFoundException("BOOK NOT FOUND");
            }
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

    public Book[] booksInPriceRange(double from, double to) {
        int index = 0;
        Book[] books = new Book[allBooksCount()];
        for (int i = 0; i < stores.length; i++) {
            for (int k = 0; k < bookCount(stores[i].getType()); k++) {
                if (stores[i].getBooks()[k].price() <= to && stores[i].getBooks()[k].price() >= from) {
                    books[index] = stores[i].getBooks()[k];
                    index++;
                }
            }
        }
        return books;
    }

    public int allBooksCount() {
        int count = 0;
        for (int i = 0; i < stores.length; i++) {
            count += bookCount(stores[i].getType());
        }
        return count;
    }


    public Book[] booksLessThan(double price) {
        int index = 0;
        Book[] books = new Book[allBooksCount()];
        for (int i = 0; i < stores.length; i++) {
            for (int k = 0; k < bookCount(stores[i].getType()); k++) {
                if (stores[i].getBooks()[k].price() < price) {
                    books[index] = stores[i].getBooks()[k];
                    index++;
                }
            }
        }
        return books;
    }

    public Book[] booksGreaterThan(double price) {
        int index = 0;
        Book[] books = new Book[allBooksCount()];
        for (int i = 0; i < stores.length; i++) {
            for (int k = 0; k < bookCount(stores[i].getType()); k++) {
                if (stores[i].getBooks()[k].price() > price) {
                    books[index] = stores[i].getBooks()[k];
                    index++;
                }
            }
        }
        return books;
    }

    public boolean removeBookByName(String bookName) {
        boolean hasRemoved = false;
        for (int i = 0; i < this.stores.length; i++) {
            for (int k = 0; k < this.stores[i].getCurrentIndex(); k++) {
                if (this.stores[i].getBooks()[k].getName().equals(bookName)) {
                    for (int y = k; y < this.stores[i].getBooks().length - 1; y++) {
                        if (this.stores[i].getBooks()[y + 1] != null) {
                            this.stores[i].getBooks()[y] = this.stores[i].getBooks()[y + 1];
                        }
                    }
                    hasRemoved = true;
                    this.bookNumber--;
                    this.stores[i].decrement();

                }

            }
        }
        return hasRemoved;
    }

    public Book[] findAllByType(BookType type) {
        Book[] foundBooks = null;
        for (int i = 0; i < this.stores.length; i++) {
            if (this.stores[i].getType() == type) {
                foundBooks = this.stores[i].getBooks();
            }
        }
        if (foundBooks == null) {
            throw new UnknownBookTypeException("UNKNOWN/WRONG BOOK TYPE");
        }
        return foundBooks;
    }
}
