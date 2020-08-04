package Homework;

public class Task_67 {
    public static void main(String[] args) {

        int i = 1900;
        int miavor = i % 10;
        int tasnavor = i % 100 /10 ;
        int haryuravor = i %1000 / 100;
        int hazaravor = i /1000;

       int j = miavor + tasnavor + haryuravor + hazaravor ;

       int k = j*j;

       if ( i == k ){
           System.out.println("YES");
       }
       else{
           System.out.println("NO");
       }
    }
}
