package Tasks_from_51_to_70;

public class Task_067 {
    public static void main(String[] args) {
/*
        String result;
        int number = 9999;
        int sum = number % 10 + (number / 10) % 10 + (number / 100) % 10 +  number / 1000;
        result = (number == sum * sum) ? "YES" : "NO";
        System.out.println(result);
 */
        int number = 9999;
        int f =  number % 10;
        int m = (number / 10) % 10;
        int m1 = (number / 100) % 10;
        int l = number / 1000;
        String result = "NO";
        int sum = (f + m + m1 + l);

        if (number == (f + m + m1 + l) * sum)
            result = "YES";
        System.out.println(result);
    }
}


