package Tasks_from_646_to_660;


public class Task_651 {
    public static void main(String[] args) {

        String dsc = "chgitem_inch_anel";
        char[] chardsc = dsc.toCharArray();
        char[] chardsc_1 = new char[chardsc.length];
        int count = 0;

        for (int i = 0; i < chardsc.length; i++) {
            for (int k = 0; k < chardsc.length; k++) {
                if (chardsc[i] == chardsc[k]) {
                    count++;
                }
            }
            if (count == 1) {
                chardsc_1[i] = chardsc[i];
            }
            count = 0;
        }
        System.out.println(chardsc_1);
    }
}
