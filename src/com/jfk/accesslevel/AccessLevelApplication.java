package com.jfk.accesslevel;

/**
 * @author William Arustamyan
 */

public class AccessLevelApplication {


    public static void main(String[] args) {


        Cube cube = new Cube(10);
        Cube cube_2 = new Cube(5);

        System.out.println(cube.volume());
        System.out.println(cube_2.volume());

    }
}
