package com.jfk.lesson13Object.Engines;

public class ManualTransmission implements Engine {
    private double power;
    public ManualTransmission(double power) {
        this.power = power;
    }

    @Override
    public void start() {
        System.out.println("Start manual");
    }

    @Override
    public void drive() {
        System.out.println("Drive manual");
    }

    @Override
    public void stop() {
        System.out.println("Stop manual");
    }
}
