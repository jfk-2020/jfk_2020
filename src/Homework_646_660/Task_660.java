package Homework_646_660;

public class Task_660 {
    public static void main(String[] args) {
        int n = 8;
        char[] char1 = {'c', 'd', 'x', 'd', 'c', 'a', 'c', 'c'};
        char[] char2 = new char[char1.length];
        for (int i = 0 ; i < char1.length; i++ ){
            if (i % 3 == 0){char2[i]='a';}else{char2[i]=char1[i];}
        }
        System.out.println(char2);
    }
}
