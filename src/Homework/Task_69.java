package Homework;

public class Task_69 {
    public static void main(String[] args) {
        int i = 1994;
        int miavor = i % 10;
        int tasnavor = i % 100 /10 ;
        int haryuravor = i %1000 / 100;
        int hazaravor = i /1000;

       int j = miavor + tasnavor+ haryuravor+ hazaravor;

       if (j > 20){int y = 1;
           System.out.println(y);}
    else {int y = 0;
           System.out.println(y);}
    }
}
