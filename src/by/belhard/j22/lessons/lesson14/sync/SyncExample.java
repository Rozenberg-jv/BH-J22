package by.belhard.j22.lessons.lesson14.sync;

public class SyncExample {

    public static void main(String[] args) throws InterruptedException{

        Counter counter = new Counter();

        Thread thread1 = new SyncThread(counter);
        Thread thread2 = new SyncThread(counter);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(counter.getI());
    }
}
