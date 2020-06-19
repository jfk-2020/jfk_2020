package com.jfk.Lesson14_UML;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }
    public String getName() {
        return firstName + " " + lastName;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary() {
        return salary * 12;
    }
    public int raiseSalary(int percent) {
        salary = salary + salary * percent / 100;
        return salary;
    }
    @Override
    public String toString() {
        return String.format("Employee[id=%d, name=%s, salary=%d]", id, getName(), salary);
    }

    public static void main(String[] args) {
        Employee employee = new Employee(1, "Artur", "Chilingaryan", 2000000000);
        System.out.println(employee);
    }
}
