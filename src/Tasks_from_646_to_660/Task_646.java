package Tasks_from_646_to_660;

public class Task_646 {
    public static void main(String[] args) {
        String dsc = "es uzum em naxadasutyun stanam, bayc, vor mejy, bayc lini";
        char[] chardsc = dsc.toCharArray();
        int count = 0;

        for (int i = 0; i <chardsc.length; i++) {
            if (chardsc[i] == 'a')
                count++;
        }

        System.out.println(count);
    }
}
