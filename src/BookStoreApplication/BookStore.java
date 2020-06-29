package BookStoreApplication;

public class BookStore extends BooksCount{

    public static void main(String[] args) {

        Dictionary[] dictBooks = new Dictionary[10];
        Encyclopedia[] encBooks = new Encyclopedia[20];






    }
    public BookStore(String name, String category, double price, int count){
            super(name, category, price, count);
            this.count = count;
        }

        @Override
        public double getPrice () {
            return 150.4;
        }

        @Override
        public String getCategory () {
            return "Dictionary";
        }
}
