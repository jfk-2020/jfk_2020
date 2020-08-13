package threads;

public class PrimitiveObject {

    int x;

    public synchronized void changeX(int x) {
        this.x = x;
    }

    public void increment() {
        synchronized (this) {
            this.x++;
        }
    }
}
