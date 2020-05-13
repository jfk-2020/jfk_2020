package Tasks_from_151_to_191;


public class Task_168 {
    public static void main(String[] args) {

        int temp=3;
        int n=150;

        while(n % temp != 0)
            temp ++;
        System.out.println(temp == n);
    }
}
