package BookStoreApplication;

public class Dictionary  extends Book{

    protected int count;

    public Dictionary(String category) {
        super(category);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public double getPrice() {
        return 150.5;
    }
}
