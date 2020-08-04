package Homework_646_660;

public class Task_650 {
    public static void main(String[] args) {
        int n = 8;
int count=0;
        char [] char1 = { 'a','z','j','k','l','i','p','z'};

        for (int i = 0 ; i < n ; i++){
            char [] char2 = { 'l','a','p','f','l','p','h','k'};
            for (int k = 0 ; k < char2.length ; k++){if (char1[i] == char2[k]){count++;break;}}
        }
        System.out.println(count);
    }
}
