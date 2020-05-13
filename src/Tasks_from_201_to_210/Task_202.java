package Tasks_from_201_to_210;

public class Task_202 {
    public static void main(String args[]) {

        int m;
        int n;
        int sum = 0;
        m = 523111233;

        while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        System.out.println("Sum of Digits: "+sum);
    }
}

