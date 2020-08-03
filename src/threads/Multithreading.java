package threads;

/**
 * @author William Arustamyan
 */


public class Multithreading {

    static int x = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread_1 = new Thread(() -> {
            System.out.println("Thread 1 working");
            x = 30;
        });
        Thread thread_2 = new Thread(() -> {
            System.out.println("Thread 2 working");
            x = 40;
        });
//        thread_1.setPriority(1);
//        thread_2.setPriority(2);
        thread_1.start();
        thread_2.start();

//        thread_1.join();
//        thread_2.join();
        Thread.sleep(2);
        System.out.println(x);

    }

}
