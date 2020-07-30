package Bookstor;

public class MathBook extends Book {

    protected MathBook ( String name , String description , double price){
        super(name, description, price);
    }
    @Override
    public BookType type (){
        return BookType.MATH;
    }
}
