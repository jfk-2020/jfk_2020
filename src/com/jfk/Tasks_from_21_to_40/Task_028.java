package com.jfk.Tasks_from_21_to_40;

public class Task_028 {
    public static void main(String[] args) {
        double a = 4;
        double b = 8;
        double c = 17;
        /*
         intov chi ashxatum, qani vor int-@ dimaci amboxjakan tivn e vercnum.
         aysinqn ete liner int c = 17, ardyunq@ linelu er TRUE, qani vor 17 / 8 = 2.5 u vercnelu er 2-@
         */

        if (a == 0 || b == 0 || c == 0) {
            System.out.println("FALSE");
        }
        else if(c / b == b / a)
        {
            System.out.println("TRUE");
        }
        else
            {
            System.out.println("FALSE");
        }
    }
}