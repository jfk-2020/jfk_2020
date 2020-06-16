package Constructors;

public class Rectangle {
    private int a;
    private int b;


    public Rectangle (int sideA , int sideB){
        a = sideA;
        b = sideB;
    }


    public int volume (){
        return a*b;
    }

}
