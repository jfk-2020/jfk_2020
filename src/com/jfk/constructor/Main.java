package com.jfk.constructor;

public class Main {
    public static void main(String[] args) {

        //Calling the constructor of the rectangle class
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println("The perimeter of rectangular is: " + rectangle.perimeter());

        //Calling the constructor of triangle class
        Triangle triangle = new Triangle(3, 5, 3, 10);
        System.out.println("The are of a triangle is: " + triangle.area());
        System.out.println("The sum of the sides of a triangle is: " + triangle.sum());

        //Calling the constructor of circle class
        Circle circle = new Circle(5);
        System.out.println("The area of a circle is: " + circle.area());
        System.out.println("The perimeter of a circle is: " + circle.perimeter());

        //Calling the constructor of prism class
        Prism prism = new Prism(10, 3, 5);
        System.out.println("The volume of a prism is: " + prism.volume());

        //Calling the constructor of electric engine
        ElectricalEngine electricalEngine = new ElectricalEngine(17);
        electricalEngine.startEngine();
        System.out.println("The engine is being started when driver uses the key");

        //Calling the constructor of manual transmission
        ManualTransmission manualTransmission = new ManualTransmission(1);
        System.out.println("Start the car by selecting the speed level 1");

        //Calling the constructor of automatic transmission
        AutomaticTransmission automaticTransmission = new AutomaticTransmission(1);
        System.out.println("Start the car by just using the key and the gas pedal, and the speed will be chosen automatically");

    }
}
