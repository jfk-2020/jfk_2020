package com.jfk.generics;

public class GenericMethod {

    private String name;

    public void display() {
        System.out.println(name);
    }

    public <T> void setName(T name) {
        this.name = name.toString();
    }

}
