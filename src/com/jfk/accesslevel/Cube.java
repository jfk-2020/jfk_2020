package com.jfk.accesslevel;

/**
 * @author William Arustamyan
 */

public class Cube {

    private int side;

    public Cube(int cubeSideLen) {
        side = cubeSideLen;
    }


    public int volume() {
        return side * side * side;
    }
}
