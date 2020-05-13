package Tasks_from_201_to_210;

public class Task_203 {
    public static void main(String[] args) {

        int m;
        int prod = 1;
        m = 516;

        while(m > 0)
        {
            prod = prod * (m % 10);
            m = m / 10;
        }
        System.out.println("Product of Digits: "+prod);
    }
}
