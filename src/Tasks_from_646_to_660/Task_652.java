package Tasks_from_646_to_660;

public class Task_652 {
    public static void main(String[] args) {
        int n = 7;
        String dsc = "chgitem";
        char[] chardsc = dsc.toCharArray();
        String dsc_1 = "gitemmm";
        char[] chardsc_1 = dsc_1.toCharArray();
        char[] chardsc_2 = new char[n];

        for (int i = 0; i < chardsc_1.length; i++) {
            for (int k = 0; k < chardsc.length; k++) {
                if (chardsc_1[i] == chardsc[k]) {
                    chardsc_2[i] = chardsc[k];
                }
            }
        }
        System.out.println(chardsc_2);

//        int n = 8;
//        char[] char1 = {'a', 'z', 'j', 'k', 'l', 'l', 'p', 'z'};
//        char[] char3 = new char[n];
//        char[] char2 = {'l', 'k', 'f', 'Y', 'p', 'h', 'o', 'i'};
//        for (int i = 0; i < char2.length; i++) {
//            for (int k = 0; k < char1.length; k++) {
//                if (char2[i] == char1[k]) {
//                    char3[i] = char1[k];
//                }
//            }
//        }
//        System.out.println(char3);
    }
}
