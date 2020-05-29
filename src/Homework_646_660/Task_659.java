package Homework_646_660;

public class Task_659 {
    public static void main(String[] args) {
        int n = 8;
        char[] char1 = {'c', 'd', 'x', 'd', 'c', 'a', 'c', 'c'};
        boolean x = false;
        for (int i = 0; i < char1.length; i++) {
            if (char1[i] == 'x') {
                x = true;
            }
        }
        int countC = 0;
        int countd = 0;

        for (int i = 0; i < char1.length; i++) {
            if (x == true) {
                if (char1[i] == 'c') {
                    countC++;
                }
            } else {
                if (char1[i] == 'd') {
                    countd++;
                }
            }
        }
    if (x==true){
        System.out.println(countC);
    }else {
        System.out.println(countd);
    }
    }
}
