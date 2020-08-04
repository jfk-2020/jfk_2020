package Bookstor;

public class Dictionary extends Book {

    protected Dictionary (String name , String description , double price){
        super(name, description, price);
    }
    @Override
    public BookType type (){
        return BookType.DICTIONARY;
    }
}





