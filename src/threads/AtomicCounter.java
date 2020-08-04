package threads;

/**
 * @author William Arustamyan
 */


public class AtomicCounter {

    static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread_1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                count = count + 1;
            }
        });
        Thread thread_2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                count = count + 1;
            }
        });
        thread_1.start();
        thread_2.start();

        thread_1.join();
        thread_2.join();

        System.out.println(count);
    }
}
