package Homework;

public class Task_56 {
    public static void main(String[] args) {
        int i = 587;
        int miansh = i % 10;
        int tasnavor = i %100 / 10 ;
        int haryuravor = i / 100 ;
        int tvanshanneriGumar = miansh + tasnavor+ haryuravor;

        System.out.println( haryuravor + " Haryuravor");
        System.out.println( tasnavor + " Tasnavor");
        System.out.println( miansh + " Mianish");
        System.out.println( tvanshanneriGumar + " Tvanshanneri gumar");

        if (miansh > tasnavor){
            System.out.println( tvanshanneriGumar / i );
        } else {
            System.out.println(i);
        }

    }
}
