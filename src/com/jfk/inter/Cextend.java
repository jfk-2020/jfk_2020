package com.jfk.inter;

/**
 * @author William Arustamyan
 */

public class Cextend implements A, C {
    @Override
    public void a() {

    }

    @Override
    public void aDefault() {

    }

    @Override
    public void c() {

    }


    public static void main(String[] args) {
        Cextend cextend = new Cextend();
        cextend.c();
    }

    @Override
    public void b() {

    }
}
