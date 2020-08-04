package Homework;

public class Task_62 {
    public static void main(String[] args) {

        int i = 4344;
        int miavor = i % 10;
        int tasnavor = i % 100 /10 ;
        int haryuravor = i %1000 / 100;
        int hazaravor = i /1000;

        System.out.println(miavor);
        System.out.println(tasnavor);
        System.out.println(haryuravor);
        System.out.println(hazaravor);

        int j = miavor + haryuravor;
        int k = tasnavor + hazaravor;

        if (i < 5000){
            System.out.println(i/j);
        }
        else { if (k==0){
            System.out.println("FALS");
        } else {
            System.out.println(i/k);
        }

    }
    }
}
