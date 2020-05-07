package Homework;

public class Task_57 {
    public static void main(String[] args) {
        int i = 262;
        int miansh = i % 10;
        int tasnavor = i %100 / 10 ;
        int haryuravor = i / 100 ;

        System.out.println( haryuravor + " Haryuravor");
        System.out.println( tasnavor + " Tasnavor");
        System.out.println( miansh + " Mianish");

        if (i> 300){
            System.out.println( tasnavor / miansh);
        } else {
            System.out.println(haryuravor/miansh);
        }
    }
}
