package new_uml_constructor;

public class Circle2_uml {
    private double radius = 1.0;

    public Circle2_uml (){
    }
    public  Circle2_uml (double radius){
        this.radius = radius;
    }
    public double getRadius (){
        return radius;
    }
    public void setRadius (double radius){
    }
    public double getArea (){
        return Math.PI * Math.pow(radius , 2);
    }
    public double getCircumFerence (){
        return 2 * Math.PI * radius;
    }
    public String tostring(){
            return "Circle[radius=" + radius + "]";
    }

}
