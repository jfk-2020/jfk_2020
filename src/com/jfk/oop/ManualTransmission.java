package com.jfk.oop;

/**
 * @author William Arustamyan
 */

public class ManualTransmission {

    private int gearCount;
    private int currentGearState;

    private ManualTransmission(int gc) {
        gearCount = gc;
        currentGearState = 0;
    }

    public void setGear(int gear) {
        if (!(gear >= 0 && gear <= gearCount)) {
            System.out.println("invalid gear parameter");
            return;
        }
        int diff = Math.abs(currentGearState - gear);
        if (diff > 1) {
            System.out.println("Warning difference between current and updated gear :  " + diff);
        }
        currentGearState = gear;
    }


    public static ManualTransmission getInstance(int gc) {
        if (gc < 0) {
            return null;
        }
        return new ManualTransmission(gc);
    }

    public int currentState() {
        return currentGearState;
    }

}
