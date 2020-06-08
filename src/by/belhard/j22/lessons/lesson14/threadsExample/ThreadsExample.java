package by.belhard.j22.lessons.lesson14.threadsExample;

public class ThreadsExample {

    public static void main(String[] args) throws InterruptedException{

        Thread thread1 = new MyThread("Thread1");
        Thread thread2 = new Thread(new MyRunnable("Runnable1"));
        Thread thread3 = new Thread(() -> {
            int i = 10;
            while (true) {
                System.out.println("RunnableInf: " + i--);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                /*if (i <= 0)
                    break;*/
            }
//            System.out.println("End RunnableInf");
        });
        thread3.setDaemon(true);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();

        System.out.println("End MainThread");
    }
}