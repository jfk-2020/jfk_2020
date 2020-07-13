package com.jfk.inheritanceHomework;

public class Person {
    protected String name;
    protected String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", address='" + address + '\'' +
//                '}';
        return String.format("Person[name=%s, address=%s]", name, address);
    }
}