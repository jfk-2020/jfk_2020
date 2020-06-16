package Constructors;

public class Rechtangle {

    static int a;
    static int b;

    public Rechtangle (int sideA,int sideB){
        a = sideA ;
        b = sideB;
    }
    public int getvolume (){
        return a * b;
    }
}
