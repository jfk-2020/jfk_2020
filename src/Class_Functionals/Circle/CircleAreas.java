package Class_Functionals.Circle;

public class CircleAreas {
    public static void main(String[] args) {

        Circle params= new Circle(9);

        System.out.println(params.getArea());
        System.out.println(params.getDiameter());
        params.setRadius(20);
        System.out.println(params.getDiameter());
        System.out.println(params.getArea());
    }
}
