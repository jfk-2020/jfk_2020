package Homework_646_660;

public class Task_653 {
    public static void main(String[] args) {
        int n = 8;
        char [] char1 = {'l', 'a', 'j', 'k','j','a', 'p', 'z'};
        int count = 0;
        int l=0;
        for (int i = 0 ; i < char1.length ; i++){
            if (char1[i]=='a'){count++;}
        }
        char []char2 = new char[n+count];
        for (int i =0; i< char1.length ; i++){
            if (char1[i]=='a'){char2[i+l]=char1[i];char2[i+1+l]='c';l++;}
            else{char2[i+l]=char1[i];}
        }
        System.out.println(char2);
    }
}
