package Homework;

public class Task_68 {
    public static void main(String[] args) {

        int i = 1321;
        int miavor = i % 10;
        int tasnavor = i % 100 /10 ;
        int haryuravor = i %1000 / 100;
        int hazaravor = i /1000;

        int j = miavor * haryuravor;

        if (miavor > tasnavor){
            System.out.println(j);
        }
        else {
            System.out.println(1);
        }
    }
}
