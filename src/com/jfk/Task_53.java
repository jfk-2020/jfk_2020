package com.jfk;

public class Task_53 {
    public static void main(String[] args) {
        int f=8;
        int i = 578;
        int miavor = i % 10;
        int tasnavor = i % 100  / 10;
        int haryuravor = i / 100;
        int tvanshanneriGumar = miavor + tasnavor + haryuravor;

        System.out.println( tvanshanneriGumar + " Tvanshhaneri gumar");
        System.out.println(haryuravor + " Haryuravor");
        System.out.println(tasnavor + " Tasnavor");
        System.out.println(miavor + " Miavor");

        if (i>f){
            System.out.println(i / tvanshanneriGumar);}
        else {
            System.out.println( tvanshanneriGumar /i);
        }

    }
}
