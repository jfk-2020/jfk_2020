package Constructors;

public class Prism {
    private int s;
    private  int h ;

    public Prism(int square , int high ){
        s = square;
        h = high;
    }

    public int volume (){
        return s * h;
    }
}
