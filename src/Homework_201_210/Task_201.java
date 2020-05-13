package Homework_201_210;

public class Task_201 {
    public static void main(String[] args) {
        int n = 10064;
        int tvanshanneriQanak = 0;
        while ( n>=1){
            if (n <10){tvanshanneriQanak = 1;break;}
            else{ if (n>=10 && n < 100){tvanshanneriQanak = 2;break;}
            else{if (n>=100 && n <1000){tvanshanneriQanak = 3;break;}else {if (n>=1000 && n <10000){tvanshanneriQanak = 4;break;}
            else {if (n>=10000 && n <100000){tvanshanneriQanak = 5;break;}}}}

            }n = n+1;
        }
        System.out.println(tvanshanneriQanak);
    }
}
