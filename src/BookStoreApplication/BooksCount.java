package BookStoreApplication;

public abstract class BooksCount extends Book {
    protected int count;


    public BooksCount (String name, String category, double price, int count) {
        super (name, category,price);
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}

