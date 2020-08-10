package threads;

/**
 * @author William Arustamyan
 */


public class AtomicCounter {

    static int count = 0;

    static PrimitiveObject primitiveObject = new PrimitiveObject();

    public static void main(String[] args) throws InterruptedException {
        Thread thread_1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
//                primitiveObject.changeX(i);
                primitiveObject.increment();
                incrementCount();

            }
        });
        Thread thread_2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
//                primitiveObject.changeX(i);
                primitiveObject.increment();
                incrementCount();
            }
        });
        thread_1.start();
        thread_2.start();

        thread_1.join();
        thread_2.join();
        System.out.println(primitiveObject.x);
        System.out.println(count);
    }

    static void incrementCount() {
        synchronized(AtomicCounter.class) {
            count++;
        }
    }
}
