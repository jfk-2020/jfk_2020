package Tasks_from_686_to_694;

public class Task_686 {
    public static void main(String[] args) {

        int n = 2;
        String dsc = "hdfghdfgjhdghjkk";
        char[] chars = dsc.toCharArray();
        char[] chars_1 = new char[chars.length * (n + 1)];

        int f = 0;
        for (int i = 0; i < chars.length; i++) {
            chars_1[i + f] = chars[i];
            for (int k = 0; k < n; k++) {
                chars_1[i + f + 1] = ',';
                f++;
            }
        }
        System.out.println(chars_1);
    }
}
 //44 -> ',' ASCII