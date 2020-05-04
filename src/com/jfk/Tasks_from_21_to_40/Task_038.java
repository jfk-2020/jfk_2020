package com.jfk.Tasks_from_21_to_40;

public class Task_038 {
    public static void main(String[] args) {
        // Ete poqr@ a-n e, apa 1-in depq! @ndhanur karogh e linel 24 depq!
        double a = 4;
        double b = 8;
        double c = 16;
        double d = 32;
        /*
         intov chi ashxatum, qani vor int-@ dimaci amboxjakan tivn e vercnum.
         aysinqn ete liner int c = 17, ardyunq@ linelu er TRUE, qani vor 17 / 8 = 2.5 u vercnelu er 2-@
         */

        if (a==0 || b==0 || c==0 || d==0) {
            System.out.println("FALSE");
        }
        else if(b/a==c/b || b/a==d/c || c/a==d/b)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }

    }
}
