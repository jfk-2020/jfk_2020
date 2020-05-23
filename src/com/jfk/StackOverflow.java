package com.jfk;

/**
 * @author William Arustamyan
 */

public class StackOverflow {

    public static void main(String[] args) {
        badFunction();
    }

    static void badFunction() {
        badFunction();
    }
}
