package homeworkThreads;

import java.util.ArrayList;

public class Consumer implements Runnable {
    private final ArrayList<Integer> list;

    Consumer(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        int count = 1;
        while (count <= 10) {
            synchronized (list) {
                while (list.size() == 0) {
                    try {
                        list.notify();
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Integer value = list.remove(0);
                System.out.println("Consumer consumed data:" + value);
                count++;
                try{
                    list.notify();
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
