package Homework;

public class Task_63 {
    public static void main(String[] args) {

        int i = 1324;
        int miavor = i % 10;
        int tasnavor = i % 100 /10 ;
        int haryuravor = i %1000 / 100;
        int hazaravor = i /1000;

        System.out.println(miavor);
        System.out.println(tasnavor);
        System.out.println(haryuravor);
        System.out.println(hazaravor);

        if ( miavor == 1 || tasnavor == 1 || haryuravor == 1 || hazaravor == 1 ){
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}
