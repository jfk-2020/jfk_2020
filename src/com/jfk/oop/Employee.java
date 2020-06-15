package com.jfk.oop;

/**
 * @author William Arustamyan
 */

public class Employee {
    //primitive types default values
    public int age;
    public boolean bool;
    public char c;
    public double d;
    public float f;

    //reference types default values
    public String name;
    public int[] array;

    static {
        System.out.println("Static scope...");
    }

    {
        System.out.println("Initialization scope");
    }

    public static void test() {
    }

    public Employee() {
        System.out.println("Empty Constructor call");
    }

    public Employee(String name) {
        this.name = name;
        System.out.println("Parameter Constructor call");
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void method_1() {

    }

    public void method_1(int x) {
        System.out.println(x);
    }
}
