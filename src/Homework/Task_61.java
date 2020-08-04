package Homework;

public class Task_61 {
    public static void main(String[] args) {
        int i = 5344;
        int miavor = i % 10;
        int tasnavor = i % 100 /10 ;
        int haryuravor = i %1000 / 100;
        int hazaravor = i /1000;

        System.out.println(miavor);
        System.out.println(tasnavor);
        System.out.println(haryuravor);
        System.out.println(hazaravor);


boolean t = (miavor + tasnavor == haryuravor + hazaravor);
        System.out.println(t);
    }
}
