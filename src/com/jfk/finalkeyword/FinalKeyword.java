package com.jfk.finalkeyword;

import com.jfk.time.Time;

/**
 * @author William Arustamyan
 */

public final class FinalKeyword {

    private final int number = 5;


    public FinalKeyword(final Time x) {
//        System.out.println(x);

    }

    public final void test(final int value) {
        //we can't override this
    }


    public static void main(final String[] args) {
//        final int x;
//        final Time time = new Time(2, 4, 6);

        final int y = 20;
        final Time z = new Time(4, 5, 6);
        new FinalKeyword(z);
//        System.out.println(z);

        SuperStudent superStudent = new SuperStudent("Math", 20, 2000.00);
//        System.out.println(superStudent.getAddress());
    }
}
