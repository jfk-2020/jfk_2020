package com.jfk.oop;

/**
 * @author William Arustamyan
 */

public class Engine {

    String serialNumber;
    String type;
    int count;
    int volumeSize;
    boolean isWorking = false;


    void start() {
        isWorking = true;
    }

    boolean stop() {
        isWorking = false;
        return true;
    }

    static void start(Engine e) {
        e.isWorking = true;
    }
}
