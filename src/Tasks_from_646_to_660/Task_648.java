package Tasks_from_646_to_660;

public class Task_648 {
    public static void main(String[] args) {
        String dsc = "es uzum em000 naxadasutyun stanam000, baycx, vor mejy, 000vor bayc lini";
        char[] chardsc = dsc.toCharArray();

        int count = 0;
        int xPlace = 0;

        for (int i = 0; i < chardsc.length; i++) {
            xPlace++;
            if (chardsc[i] == 'x') {
                break;
            }
        }
        for (int i = xPlace; i < chardsc.length; i++) {
            if (chardsc[i] == '0') {
                count++;
            }
        }
        System.out.println(count);
    }
}

