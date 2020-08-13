package homeworkThreads;

import java.util.ArrayList;

public class Producer implements Runnable {
    private final ArrayList<Integer> list;

    Producer(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        int count = 1;
        while (count <= 10) {
            synchronized (list) {
                list.add(count);
                System.out.println("Producer produced data:" + count);
                count++;
                try {
                    list.notify();
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
