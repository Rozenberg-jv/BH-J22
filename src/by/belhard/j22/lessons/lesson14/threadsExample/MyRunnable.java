package by.belhard.j22.lessons.lesson14.threadsExample;

import static java.lang.Thread.sleep;

public class MyRunnable implements Runnable {

    private final String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println(name + ": " + i);

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("End " + name);
    }
}
