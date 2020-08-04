package Homework_211_250;

public class Task_220 {
    public static void main(String[] args) {
        int[] ints = new int[9];
        ints[0]= 6 ;
        ints[1]= -25 ;
        ints[2]= -5 ;
        ints[3]= 41 ;
        ints[4]= -8;
        ints[5]= -11 ;
        ints[6]= 17;
        ints[7]= 5 ;
        ints[8]= -9 ;
        int d = 0;
        int b = 0;
        for ( int i = 0; i < ints.length ; i++ ){
        if (ints[i] >= 0){d = d + 1;}
        else{b = b + 1;}
        }
        System.out.println("Drakan "+d);
        System.out.println("Bacasakan "+b);
    }
}
