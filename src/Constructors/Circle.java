package Constructors;

public class Circle {
    private int radius ;
    private double p;

    public Circle(int radius , double p){
        this.radius = radius;
        this.p = p;
    }
    public double volume (){
        return p * Math.pow(radius,2);
    }
    public double length (){
        return 2 * p * radius;
    }

}
