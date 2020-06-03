package Tasks_from_686_to_694;

public class Task_689 {
    public static void main(String[] args) {
        String dsc = "hd1fghd2fgj4hD6gh7jkk9lKjfKhdGft";
        char[] chars = dsc.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 65 && chars[i] <= 90) {
                continue;
            } else if (chars[i] < 48 || chars[i] > 57) {
                chars[i] = (char) (chars[i] - 32);
            }
        }
        System.out.println(chars);
    }
}
