package Bookstor;

public class TipeStore {
     private final BookType type ;
     private final Book [] books;
     private int currentIndex;


    public TipeStore ( BookType type , int storeSize){
        this.type = type;
        this.books = new Book[storeSize];
        this.currentIndex = 0;
    }

    public Book[] getBooks() {
        return books;
    }

    public BookType getType() {
        return type;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }
    public void increment (){
        this.currentIndex++;
    }
    public void decrement (){
        this.currentIndex--;

    }

}
