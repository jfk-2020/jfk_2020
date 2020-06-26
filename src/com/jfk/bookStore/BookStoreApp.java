package com.jfk.bookStore;

public class BookStoreApp {

    private final Book[] arrayBooks;
    private int index = 0;

    public BookStoreApp(int storeSize) {
        this.arrayBooks = new Book[storeSize];
    }


    //add book
    public void addBook(Book book) {
        arrayBooks[index] = book;
        index++;
    }

    //remove book
    public void removeBook() {
        arrayBooks[index - 1] = null;
        index--;
    }

    public Book[] allBooks() {
        return this.arrayBooks;
    }

    //get books by types
    public Book[] getBooksByType(String type) {
        //Create new array
        Book[] newArrayBooks = null;
        int c = 0;
        for (int i = 0; i < index; i++) {
            if (arrayBooks[i].getType().equals(type)) {
                if (newArrayBooks == null) {
                    newArrayBooks = new Book[index];
                }
                newArrayBooks[c++] = arrayBooks[i];
            }
        }
        return newArrayBooks;
    }
}
