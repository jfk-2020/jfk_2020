package com.jfk.inter;

/**
 * @author William Arustamyan
 */

public interface A extends B {

    void a();

    default void aDefault() {

    }

    default void c() {
        System.out.println("A");
    }
}
