package Homework_646_660;

public class Task_649 {
    public static void main(String[] args) {
        int n = 8;
        int count = 0;
        int temp =0;
        char [] chars = { 'a','z','j','k','l','i','p','z'};
        for (int i = 0; i< n ; i++){
            if (chars[i] == 'z'){temp = i -count;count=i;}

        }

        System.out.println(temp-1);
    }
}
