package BookStoreApplication;

public abstract class Book {

    protected String name;
    protected String category;
    protected double price;


    public Book (String category) {
        this.category = category;
    }

    public Book (String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public abstract double getPrice();


    public String getCategory() {
        return category;
    };

    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    @Override
    public String toString() {
        return "Book[name = " + name +
                ", category = " + category +
                ", price = " + price + "]";
    }
}
