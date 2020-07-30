package Homework_686_694;

public class Task_691 {
    public static void main(String[] args) {
        char[] char1 = {'0', '6', '0', '5', '1', '.', '0', '0'};
        int tiv = 0;
        int ket = 0;
        int tarKamNshan = 0;
        for (int i = 0; i < char1.length; i++) {
            if (char1[i] <= 57 && char1[i] >= 48) {
                tiv++;
            } else {
                if (char1[i] == 46) {
                    ket++;
                } else {
                    tarKamNshan++;
                }

            }
        }
        if (tiv == char1.length) {
            System.out.println(2);
        } else {
            if (ket == 1 && tiv == char1.length - 1) {
                System.out.println(1);
            } else {
                System.out.println(3);
            }
        }


    }
}
