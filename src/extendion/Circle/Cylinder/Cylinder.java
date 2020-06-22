package extendion.Circle.Cylinder;

public class Cylinder extends Circle{
    private double height = 1.0;

    public Cylinder(){};
    public Cylinder(double radius){
        super.radius = radius;
    }
    public Cylinder(double radius , double height){
        super.radius = radius;
        this.height = height;
    }
    public Cylinder(double radius, double height , String color){
        super.radius = radius;
        this.height = height;
        super.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double Volume (){
        return height * Math.PI * Math.pow(radius,2);
    }
}

