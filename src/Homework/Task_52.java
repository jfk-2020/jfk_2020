package Homework;

public class Task_52 {

    public static void main(String[] args) {

        int i = 898;
        int miavor = i % 10;
        int tasnavor = i % 100 / 10;
        int haryuravor = i / 100;
        System.out.println(haryuravor + " Haryuravor");
        System.out.println(tasnavor + " Tasnavor");
        System.out.println(miavor + " Miavor");

        Boolean k = ( haryuravor == tasnavor || tasnavor == miavor || miavor == haryuravor );

        System.out.println(k);

    }
}
