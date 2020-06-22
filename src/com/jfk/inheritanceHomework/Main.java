package com.jfk.inheritanceHomework;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1.0, "red");
        Cylinder cylinder = new Cylinder(1.0, 7);

        System.out.println(circle.getArea());
        System.out.println(cylinder.getVolume());

        Person person = new Person("John", "LA");
        Student student = new Student("Lucy", "LA", "Math", 2010, 45.000);
        Staff staff = new Staff("Jack", "LA", "California", 45.000);

        System.out.println(person.getAddress());
        System.out.println(person.getName());

        System.out.println(student.getName());
        System.out.println(student.getAddress());
        System.out.println(student.getProgram());
        System.out.println(student.getYear());
        System.out.println(student.getFee());

        System.out.println(staff.getName());
        System.out.println(staff.getAddress());
        System.out.println(staff.getSchool());
        System.out.println(staff.getPay());

        Point2D point2D = new Point2D((float) 1.2345, (float) 1.2345);

        System.out.println(point2D.getX());
        System.out.println(point2D.getY());

        Point3D point3D = new Point3D((float) 1.2345, (float) 1.2345, (float) 2.345);
        System.out.println(point3D.getX());
        System.out.println(point3D.getY());
        System.out.println(point3D.getZ());
    }
}
