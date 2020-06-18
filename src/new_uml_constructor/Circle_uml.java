package new_uml_constructor;

public class Circle_uml {

    private double radius = 1.0;
    private String collor = "red";

    public Circle_uml(){};
    public Circle_uml(double radius){
        this.radius = radius;
    }
    public Circle_uml(double radius ,String collor){
        this.radius= radius;
        this.collor = collor;
    }
    public double getRadius(){
        return radius;
    }
    public String getCollor (){
        return collor;
    }
    public void setRadius(double radius){

    }
    public void setCollor(String collor){

    }public void tostring (double radius , String collor){

    }
    public double getArea (){
        return 3.14 * Math.pow(radius,2);
    }
}

