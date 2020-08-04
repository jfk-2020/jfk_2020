package Homework;

public class Task_58 {
    public static void main(String[] args) {
        int i = 251;
        int miansh = i % 10;
        int tasnavor = i % 100 / 10;
        int haryuravor = i / 100;

        System.out.println(haryuravor + " Haryuravor");
        System.out.println(tasnavor + " Tasnavor");
        System.out.println(miansh + " Mianish");

        char f;
        if (tasnavor + haryuravor < 5) {
            f = 'a';
        } else {
            f = 'b';
        }
        System.out.println(f);


    }
}