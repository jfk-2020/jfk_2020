package com.jfk.finalkeyword;

/**
 * @author William Arustamyan
 */

public class SuperStudent extends Student {


    {
        System.out.println("SuperStudent INIT");
    }

    public SuperStudent(String program, int year, double fee) {
        super(program, year, fee);
        System.out.println("Super Student");
    }

}
