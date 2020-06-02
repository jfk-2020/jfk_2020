package Tasks_from_646_to_660;

public class Task_650 {
    public static void main(String[] args) {
        String dsc = "chgitem";
        char[] chardsc = dsc.toCharArray();
        String dsc_1 = "gitem";
        char[] chardsc_1 = dsc_1.toCharArray();

        int count = 0;

        for (int i = 0; i < chardsc.length; i++) {
            for (int k = 0; k < chardsc_1.length; k++) {
                if (chardsc[i] == chardsc_1[k]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
