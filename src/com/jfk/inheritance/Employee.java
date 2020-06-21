package com.jfk.inheritance;

/**
 * @author William Arustamyan
 */

public class Employee {
    protected int age;

    public Employee(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                '}';
    }
}
