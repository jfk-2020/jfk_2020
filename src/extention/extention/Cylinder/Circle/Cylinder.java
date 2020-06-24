package extention.extention.Cylinder.Circle;

import extention.extention.Cylinder.Circle.Circle;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder(){};
    public Cylinder(double radius){
     radius = getRadius();
    }
    public Cylinder(double radius , double height){
        radius =getRadius();
        this.height = height;

    }
    public Cylinder(double radius, double height , String color){
         setRadius(radius);
        this.height = height;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double Volume (){
        return height * Math.PI * Math.pow(getRadius(),2);
    }
}

