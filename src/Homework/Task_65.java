package Homework;

public class Task_65 {
    public static void main(String[] args) {

        int i = 43;
        int miavor = i % 10;
        int tasnavor = i % 100 /10 ;


        System.out.println(miavor);
        System.out.println(tasnavor);

        if( miavor * tasnavor == 12){
            System.out.println("y=12");
        }
        else {
            System.out.println("y=0");
        }
    }
}
