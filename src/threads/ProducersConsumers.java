package threads;

import java.util.ArrayList;
import java.util.List;

public class ProducersConsumers {
    public static void main(String[] args) throws InterruptedException {

        final List<Integer> goods = new ArrayList<>();

        ProducersThread producer = new ProducersThread(goods);
        ConsumerThread consumer = new ConsumerThread(goods);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();

        producerThread.join();
        consumerThread.join();


    }
}
