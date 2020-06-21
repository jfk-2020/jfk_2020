package Child_Files.CircleCylinder;

public class Cylinder extends Circle{
    private double height = 1.0;

    public Cylinder () {};

    public Cylinder (double radius) {
        super (radius);
    }
    public Cylinder (double radius, double heigth) {
        super (radius);
        this.height = height;
    }
    public Cylinder (double radius, double height, String color) {
        super (radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume () {
        return (Math.PI * Math.pow(getRadius(), 2)) * height;
    }

//    public static void main(String[] args) {
//        Cylinder cylinder = new Cylinder();
//
//        System.out.println(cylinder.getVolume());
//    }
}
