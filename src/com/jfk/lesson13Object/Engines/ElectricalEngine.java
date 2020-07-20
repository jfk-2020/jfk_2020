package com.jfk.lesson13Object.Engines;

public class ElectricalEngine implements Engine {
    private double power;
    public ElectricalEngine(double power) {
        this.power = power;
    }

    @Override
    public void start() {
        System.out.println("Start electric");
    }

    @Override
    public void drive() {
        System.out.println("Drive electric");
    }

    @Override
    public void stop() {
        System.out.println("Stop electric");
    }
}
