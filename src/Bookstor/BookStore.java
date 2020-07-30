package Bookstor;

public class BookStore {

    private final TipeStore[] stores;

    public int bookNumber;

    public BookStore(int size) {
        this.stores = new TipeStore[BookType.values().length];
        for (int i = 0; i < BookType.values().length; i++) {
            stores[i] = new TipeStore(BookType.values()[i], size);
        }
    }

    public void addBook(Book book) {


        BookType type = book.type();
        for (int i = 0; i < this.stores.length; i++) {
            if (this.stores[i].getType() == type) {
                this.stores[i].getBooks()[this.stores[i].getCurrentIndex()] = book;
                this.stores[i].increment();
                this.bookNumber++;
            }
        }
        System.out.println(" DONE adding book");
    }

    public Book[] findAllByType(BookType type) {
        for (int i = 0; i < this.stores.length; i++) {
            if (this.stores[i].getType() == type) {
                return this.stores[i].getBooks();
            }
        }
        return null;
    }

    //------------------------------------------------------------------------------
    public double priceSummery(BookType bookType) {
        Book[] books = findAllByType(bookType);
        if (books == null) {
            return -1;
        }
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

    //-------------------------------------------------------------------------------
    public int bookCount(BookType bookType) {
        int count = 0;
        Book[] books = findAllByType(bookType);
        if (books == null) {
            return -1;
        }
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    //-----------------------------------------------------------------------------------
    public double maxPrice(BookType bookType) {
        Book[] books = findAllByType(bookType);
        double max = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].price > max) {
                max = books[i].price;
            }
        }
        return max;
    }

    //-----------------------------------------------------------------------------------
    public double priceSummery() {
        double totalSummary = 0.0;
        for (int i = 0; i < this.stores.length; i++) {

            if (bookCount(stores[i].getType()) != 0) {
                totalSummary = totalSummary + priceSummery(stores[i].getType());
            }
        }
        return totalSummary;
    }

    //-----------------------------------------------------------------------------------
    boolean containsBookByNameAndType(String bookName, BookType bookType) {
        boolean contains = false;
        Book[] books = findAllByType(bookType);
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                if (books[i].getName() == bookName) {
                    contains = true;
                }
            }
        }
        return contains;
    }

    boolean containsBookByName(String bookName) {
        boolean contains = false;
        for (int i = 0; i < this.stores.length; i++) {
            if (containsBookByNameAndType(bookName, stores[i].getType())) {
                contains = true;
            }
        }
        return contains;
    }
//---------------------------------------------------------------------------------------------

    public Book[] booksInOneType(BookType bookType) {
        Book[] books = findAllByType(bookType);
        Book[] bookInOneType = new Book[books.length];
        int index = 0;
        for (int i = 0; i < books.length; i++) {

            bookInOneType[index] = books[i];
            index++;

        }
        return bookInOneType;
    }

    Book[] allBookInOneArray() {
        int index = 0;
        Book[] bookInOneArray = new Book[this.bookNumber];
        for (int i = 0; i < stores.length; i++) {
            if (stores[i] != null) {
                if (booksInOneType(stores[i].getType()) != null) {
                    booksInOneType(stores[i].getType());
                    for (int k = 0; k < booksInOneType(stores[i].getType()).length; k++) {
                        if (booksInOneType(stores[i].getType())[k] != null) {
                            bookInOneArray[index] = booksInOneType(stores[i].getType())[k];
                            index++;
                        }
                    }
                }
            }
        }
        return bookInOneArray;
    }

    //----------------------------------------------------------------------------------------
    public Book[] booksInPriceRange(double from, double to) {
        Book[] booksInPriceRange = new Book[allBookInOneArray().length];
        int index = 0;
        Book[] books = allBookInOneArray();
        for (int i = 0; i < books.length; i++) {
            if (books[i].price < to && books[i].price > from) {
                booksInPriceRange[index] = books[i];
                index++;
            }
        }
        return booksInPriceRange;
    }


    ////---------------------------------------------------------------------------------------------
    public Book[] booksLessThen(double price) {
        Book[] booksLessThenPrice = new Book[allBookInOneArray().length];
        int index = 0;
        Book[] books = allBookInOneArray();

        for (int i = 0; i < books.length; i++) {
            if (books[i].price < price) {
                booksLessThenPrice[index] = books[i];
                index++;
            }
        }
        return booksLessThenPrice;
    }

    //-----------------------------------------------------------------------------------------
    public Book[] booksGreaterThan(double price) {
        Book[] booksGreaterThenPrice = new Book[allBookInOneArray().length];
        int index = 0;
        Book[] books = allBookInOneArray();

        for (int i = 0; i < books.length; i++) {
            if (books[i].price > price) {
                booksGreaterThenPrice[index] = books[i];
                index++;
            }
        }
        return booksGreaterThenPrice;
    }

    //-----------------------------------------------------------------------------------------
    public boolean removeBookByName(String bookName) {
        boolean hasRemoved = false;
        for (int i = 0; i < this.stores.length; i++) {
            for (int k = 0; k < this.stores[i].getBooks().length; k++) {
                if (this.stores[i].getBooks()[k].getName() == bookName) {
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
}
