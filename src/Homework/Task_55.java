package Homework;

public class Task_55 {
    public static void main(String[] args) {

        int i = 455;
        int miavor = i % 10;
        int tasnavor = i % 100 / 10;
        int haryuravor = i / 100;

        System.out.println(haryuravor + " Haryuravor");
        System.out.println(tasnavor + " Tasnavor");
        System.out.println(miavor + " Miavor");

        if (miavor<=tasnavor){
            if (miavor <= haryuravor){
                System.out.println(miavor + " min");
            } else {
                System.out.println(haryuravor + " min");
                }
        }
        else{ if(tasnavor <= haryuravor){
            System.out.println( tasnavor + " min");
        } else {
            System.out.println(haryuravor + " min");
        }


    }
    }
}
