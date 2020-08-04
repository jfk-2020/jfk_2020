package Homework;

public class Task_66 {
    public static void main(String[] args) {
        int i = 4324;
        int miavor = i % 10;
        int hazaravor = i /1000;

        if (miavor == 4 || hazaravor == 4){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
