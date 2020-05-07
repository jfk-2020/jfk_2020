package Homework;

public class Task_51 {
    public static void main(String[] args) {

        int i = 538;
        int miavor = i % 10;
        int tasnavor = i % 100 / 10;
        int haryuravor = i / 100;

        System.out.println(haryuravor + " Haryuravor");
        System.out.println(tasnavor + " Tasnavor");
        System.out.println(miavor + " Miavor");

        boolean f = ( miavor == haryuravor + tasnavor);
        System.out.println(f);
    }
}
