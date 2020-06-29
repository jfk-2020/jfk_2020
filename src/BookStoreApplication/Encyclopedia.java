package BookStoreApplication;

public class Encyclopedia extends Book {

    public Encyclopedia(String category) {
        super(category);
    }

    @Override
    public double getPrice() {
        return 180.7;
    }
}
