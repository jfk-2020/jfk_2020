package threads;

import java.util.List;
import java.util.concurrent.locks.Lock;

public class DBJob implements Runnable {

    final List<Integer> data;
    final Lock lock;

    public DBJob(final List<Integer> data, Lock lock) {
        this.data = data;
        this.lock = lock;
    }


    @Override
    public void run() {
//        try {
            while (true) {
//            lock.lock();
                synchronized (this.data) {
                    if (this.data.size() == 100) {
                        System.out.println("start insert data to database");
                        this.data.clear();
                        System.out.println("end database insertion");
                    }
                    this.data.notifyAll();
                }
//            lock.unlock();
            }
//        } finally {
//            lock.unlock();
//        }

    }
}
