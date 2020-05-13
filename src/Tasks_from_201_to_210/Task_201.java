package Tasks_from_201_to_210;

public class Task_201 {
    public static void main(String[] args) {

        int count = 0;
        int num = 34520000;

//        while (num != 0) {
//            // num = num/10
//            num /= 10;
//            ++count;
//        }

        for (; num != 0; num = num / 10) {
            ++count;
        }
        System.out.println("Number of digits: " + count);

    }
}
