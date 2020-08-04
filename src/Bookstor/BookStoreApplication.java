package Bookstor;

public class BookStoreApplication {
    public static void main(String[] args) {

        BookStore store = new BookStore(10);
        store.addBook(new Dictionary("Dictionary", "Dictionary book", 100));
        store.addBook(new Dictionary("Dictionary 1", "Dictionary 1 book", 90));
        store.addBook(new MathBook("Math", "Math book", 112));

        double priceSummary = store.priceSummery();
        System.out.println(priceSummary);

        int bookCount = store.bookCount(BookType.DICTIONARY);
        System.out.println(bookCount);

        double maxPrice = store.maxPrice(BookType.DICTIONARY);
        System.out.println(maxPrice);

        boolean containsByName = store.containsBookByName("Math");
        System.out.println(containsByName);

        System.out.println(store.bookNumber);
        Book[] ints = store.allBookInOneArray();
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i].name);
        }
        System.out.println("===============");
        Book[] intss = store.booksLessThen(105);
        for (int i = 0; i < intss.length; i++) {
            if (intss[i] != null) {
                System.out.println(intss[i].name);
            }
        }
        System.out.println("===============");
        Book[] intsss = store.booksGreaterThan(99);
        for (int i = 0; i < intsss.length; i++) {
            if (intsss[i] != null) {
                System.out.println(intsss[i].name);
            }
        }

        System.out.println("==============");
        Book[] inti = store.booksInPriceRange(80,130);
        for (int i = 0; i < inti.length; i++) {
            if (inti[i] != null) {
                System.out.println(inti[i].name);
            }
        }
    }

}
