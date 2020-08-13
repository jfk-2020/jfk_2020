package homeworkThreads;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> list = new ArrayList();
        Thread firstThread = new Thread(new Producer(list));
        Thread secondThread = new Thread(new Consumer(list));

        firstThread.start();
        secondThread.start();

        firstThread.join();
        secondThread.join();

    }
}
