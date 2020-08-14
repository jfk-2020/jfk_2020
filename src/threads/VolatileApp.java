package threads;

public class VolatileApp {

    static volatile int x = 5;
    static volatile int y = 10;
    static volatile int z;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                z = x + y;
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (z == 15) {
                    System.out.println("15");
                } else {
                    System.out.println("not 15");
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//               for (int i = 1_000_000_000; i>=0; i--) {
//                   x=x+1;
//               }
//            }
//        });
//        t1.start();
//        t1.join();
    }
}
