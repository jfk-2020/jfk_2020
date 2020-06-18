package Class_Functionals.Classes_UML.Rectangle;

public class test_Rectangle {
    public static void main(String[] args) {

        Rectangle object = new Rectangle();
        Rectangle object_1 = new Rectangle(2.6f,1.4f);

        System.out.println(object);
        System.out.println(object_1);
        System.out.println(object.getLength());
        System.out.println(object_1.getLength());
        object.setLength(3.5f);
        object_1.setLength(3.7f);
        System.out.println(object.getWidth());
        System.out.println(object_1.getWidth());
        object.setWidth(2.6f);
        object_1.setWidth(2.9f);
        System.out.println(object.getArea());
        System.out.println(object_1.getArea());
        System.out.println(object.getPerimeter());
        System.out.println(object_1.getPerimeter());
        System.out.println(object.toString());
        System.out.println(object_1.toString());
    }
}
