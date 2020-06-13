package com.jfk.Lesson13_Object.Engines;

public class AutomaticTransmission implements Engine {
    private double power;
    public AutomaticTransmission(double power) {
        this.power = power;
    }

    @Override
    public void start() {
        System.out.println("Start automatic");
    }

    @Override
    public void drive() {
        System.out.println("Drive automatic");
    }

    @Override
    public void stop() {
        System.out.println("Stop automatic");
    }
}
