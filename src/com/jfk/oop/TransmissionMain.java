package com.jfk.oop;

/**
 * @author William Arustamyan
 */

public class TransmissionMain {


    public static void main(String[] args) {
        ManualTransmission tr = ManualTransmission.getInstance(-5);

        System.out.println(tr.currentState());
        tr.setGear(0);
    }
}
