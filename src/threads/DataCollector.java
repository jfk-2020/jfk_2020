package threads;

import java.util.List;
import java.util.concurrent.locks.Lock;

public class DataCollector implements Runnable {

    final List<Integer> data;
    final Lock lock;


    public DataCollector(final List<Integer> data, Lock lock) {
        this.data = data;
        this.lock = lock;
    }

    @Override
    public void run() {
        int number = 1;
        synchronized (this.data) {
            while (this.data.size() < 100) {
                System.out.println("Adding number : " + number);
                this.data.add(number);
                number++;
            }
            this.data.notifyAll();
        }

//        this.lock.unlock();

    }
}
