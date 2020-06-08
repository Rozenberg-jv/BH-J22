package by.belhard.j22.lessons.lesson14.sync;

public class SyncThread extends Thread {

    private Counter counter;

    public SyncThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10_000_000; i++) {
            counter.incI();
        }
    }
}
