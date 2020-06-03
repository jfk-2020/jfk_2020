package Tasks_from_686_to_694;

public class Task_694 {

    public static void main(String[] args) {

        String dsc = "8-3+6+7-8-6+5";
        char[] chars = dsc.toCharArray();
        int sum = chars[0] - 48;

        for (int i = 0; i < chars.length; i++) {
              if (chars[i] == 45) {
                sum = sum - (chars[i + 1] - 48);
            } else {
                if (chars[i] == 43) {
                    sum = sum + (chars[i + 1] - 48);
                }
            }
        }
        System.out.println(sum);
    }
}


//43 (-), 45 (+)