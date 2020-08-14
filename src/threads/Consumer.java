package threads;

import java.util.List;

class ConsumerThread implements Runnable {
    final List<Integer> goods;

    public ConsumerThread (List<Integer>goods){
        this.goods = goods;
    }

    @Override
    public void run() {
        try {
            wait(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (this.goods.size()>=100){
            System.out.println("cleaning list is started");
            this.goods.clear();
            System.out.println("cleaning is done");
        }
    this.notifyAll();
    }
}

