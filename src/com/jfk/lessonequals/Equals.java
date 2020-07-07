package com.jfk.lessonequals;

/**
 * @author William Arustamyan
 */

public class Equals {

    public static void main(String[] args) {
//        A a = new A();
//        A aa = a;
//        B b = new B(); //2345
//        boolean equals = a.equals(aa);
//        System.out.println(equals);


        User a = new User();
        a.serialNumber = "AS12";
        User b = new User();
        b.serialNumber = "AS12";
        System.out.println(a.equals(b));

    }

    private static class A {
        int a;
    }

    private static class B {
        int b;
    }

    private static class User {
        String serialNumber;


        public boolean equals(Object object) {
            if (!(object instanceof User)) {
                return false;
            }
            User that = (User) object;
            return this.serialNumber.equals(that.serialNumber);
        }
    }
}
