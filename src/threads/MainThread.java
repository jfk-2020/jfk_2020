package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MainThread {


    public static void main(String[] args) throws InterruptedException {

        final List<Integer> data = new ArrayList<>();
        final Lock lock = new ReentrantLock(true);

        Thread[] producers = new Thread[5];
        Thread[] consumers = new Thread[5];

        for (int i =0; i < 5; i++) {
//            producers[i] = new Thread(new )
        }

        for (int i =0; i < 5; i++) {
            producers[i].start();
            consumers[i].start();
            producers[i].join();
            consumers[i].join();
        }

        DataCollector collector = new DataCollector(data, lock);
        DBJob job = new DBJob(data, lock);

        Thread collectorThread = new Thread(collector, "Collector Thread");
        Thread dbInsertThread = new Thread(job, "Database job");

        collectorThread.start();

        dbInsertThread.start();

        collectorThread.join();
        dbInsertThread.join();

    }
}
