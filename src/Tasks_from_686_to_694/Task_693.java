package Tasks_from_686_to_694;

public class Task_693 {

    public static void main(String[] args) {

        String dsc = "12367865";
        char[] chars = dsc.toCharArray();
        int sum = 0;

        for (int i = 0; i < chars.length; i++) {
            sum += chars[i] - 48;
        }
        System.out.println(sum);
    }
}
