package Tasks_from_686_to_694;

public class Task_688 {
    public static void main(String[] args) {
        String dsc = "hd1fghd2fgj4hd6gh7jkk9lkjf";
        char[] chars = dsc.toCharArray();
        int counter = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < 48 || chars[i] > 57)
                counter++;
        }
        System.out.println(counter);
    }
}
