package Tasks_from_686_to_694;

public class Task_692 {
    public static void main(String[] args) {
        String dsc = "12367865";
        char[] chars = dsc.toCharArray();
        char[] chars_1 = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
                chars_1[chars.length - 1 -i] = chars[i];
        }
        System.out.println(chars_1);
    }
}
