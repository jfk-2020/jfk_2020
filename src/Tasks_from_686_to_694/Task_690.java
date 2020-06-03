package Tasks_from_686_to_694;

public class Task_690 {
    public static void main(String[] args) {
        String dsc = "hd1FGHd2fgj4hD6gh7jkK9lKjFKhdGft";
        char[] chars = dsc.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 65 && chars[i] <= 90) {
                chars[i] = (char) (chars[i] + 32);;
            } else if (chars[i] < 48 || chars[i] > 57) {
                chars[i] = (char) (chars[i] - 32);
            }
        }
        System.out.println(chars);
    }
}
