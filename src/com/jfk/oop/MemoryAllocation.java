package com.jfk.oop;

/**
 * @author William Arustamyan
 */

public class MemoryAllocation {

    public static void main(String[] args) {
//        Employee.test();
//        Employee employee = new Employee();
//        employee.method_1(1);
//        System.out.println(employee.age);
//        System.out.println(employee.bool);
//        System.out.println(employee.c);
//        System.out.println(employee.d);
//        System.out.println(employee.f);
//        System.out.println(employee.array);
//        System.out.println(employee.name);

//        Employee paramEmp = new Employee("name");

//        Employee secondEmp = new Employee("name",  12);

        Address address = new Address("0123456789", "Xnajyan");

        System.out.println(address.getAddress());

        Person person = new Person("name", 34, new Address("dd", "ddd"));
        HiddenPerson hp = new HiddenPerson(address);

        System.out.println(person.getAddress().getAddress());

        address.setAddress("new ADDRESS");

        System.out.println(person.getAddress().getAddress());

        System.out.println(hp.getAddress().getAddress());
    }
}
