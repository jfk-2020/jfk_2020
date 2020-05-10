package Tasks_from_151_to_191;

public class Task_162 {
    public static void main(String[] args) {
        int a;
        double b;
        boolean t = false;

        for (int i = 9999; i > 1000; i --)
        {
            a = (int) Math.sqrt(i * 14);
            b = Math.sqrt(i * 14);
            if (a == b) {
                t = true;
                System.out.println((int) i);
                break;
            }
        }
        if (t == false)
            System.out.println("AYDPISI TIV CHKA!!!");
    }
}
