package com.jfk.bookStore;

public class BookStoreApp {

    Book[] arrayBooks = new Book[1000];
    private int index = 0;

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

    //get books by types
    public Book[] getBooksByType(String type) {

        //Create new array
        Book[] newArrayBooks = new Book[index];

        for (int i = 0; i < index; i++) {
            if (arrayBooks[i].getType().equals(type)) {
                newArrayBooks[i] = arrayBooks[i];
            }
        }
        return newArrayBooks;
    }
}
