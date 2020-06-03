package Tasks_from_646_to_660;

public class Task_649 {
    public static void main(String[] args) {
        String dsc = "es uzum em naxadasutyun stanam, bayc, vor zmejy, vor bayc lini";
        char[] chardsc = dsc.toCharArray();

        int counterFirst = 0;
        int totalCount = 0;

        while (dsc.charAt(counterFirst) != 'z')
            counterFirst++;
        while (dsc.charAt(++counterFirst) != 'z')
            totalCount++;

        System.out.println(totalCount);
    }
}
