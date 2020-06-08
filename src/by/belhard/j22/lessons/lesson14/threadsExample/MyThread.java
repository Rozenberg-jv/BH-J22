package by.belhard.j22.lessons.lesson14.threadsExample;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println(getName() + ": " + i);

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("End " + getName());
    }
}
