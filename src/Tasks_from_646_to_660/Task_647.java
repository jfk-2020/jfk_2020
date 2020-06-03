package Tasks_from_646_to_660;

public class Task_647 {

    public static void main(String[] args) {

        String str = "abcccba";
        char[] charsrt = str.toCharArray();
        boolean t = true;

        int j = str.length() - 1;

        for (int i = 0; i < j; i++) {
            if (str.charAt(i) != str.charAt(j))
                t = false;
                j--;
        }
        System.out.println(t);
    }
}
