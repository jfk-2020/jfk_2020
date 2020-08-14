package threads;

import java.util.List;

class ProducersThread implements Runnable{

final List<Integer> goods;

    public ProducersThread(List<Integer> goods){
    this.goods = goods;
    }

    @Override
    public synchronized void run() {

        System.out.println("producing is in process");
        int count = 0;
        while (true){
            System.out.println("Adding in List"+ count);
            this.goods.add(count);
            count++;
            this.notifyAll();

        }
    }
}
