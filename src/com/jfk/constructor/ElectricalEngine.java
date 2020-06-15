package com.jfk.constructor;

public class ElectricalEngine {

    //Fields of an electrical engine
    private int power;

    //Creating constructor
    public ElectricalEngine(int power) {
        this.power = power;
    }

    //Creating function to start the engine
    public void startEngine() {
        System.out.println("Engine is started ...");
    }
}
