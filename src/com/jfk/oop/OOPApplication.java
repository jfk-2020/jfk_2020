package com.jfk.oop;

/**
 * @author William Arustamyan
 */

public class OOPApplication {

    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.count = 4;
        engine.serialNumber = "WS343434";
        engine.type = "D";
        engine.volumeSize = 2;

        Engine.start(engine);

        engine.start();

        boolean isStopped = engine.stop();
        System.out.println(isStopped);

    }

    static void start(Engine e) {
        e.isWorking = true;
    }

    static void start(String e) {
        System.out.println("e : " + e);
    }

    static void changeThis(int k) {
        k = 20;
    }
    //function name - > x2424f
}
