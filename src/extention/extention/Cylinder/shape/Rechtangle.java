package extention.extention.Cylinder.shape;

import new_uml_constructor.Rectangle_uml;

public class Rechtangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rechtangle (){}
    public Rechtangle (double width , double length){
        this.width = width ;
        this.length = length;
    }
    public  Rechtangle (double width , double length , String color , boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea (){
        return width * length;
    }
    public double getPerimeter (){
        return 2 * width + 2 * length ;
    }

    @Override
    public String toString() {
        return "Rechtangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
