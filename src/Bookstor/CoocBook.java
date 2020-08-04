package Bookstor;

public class CoocBook extends Book {

    protected CoocBook (String name , String description , double price){
        super(name, description, price);
    }
    @Override
    public BookType type (){
        return BookType.COOKBOOK;
    }

}
