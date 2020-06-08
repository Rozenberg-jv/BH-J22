package by.belhard.j22.lessons.lesson14.sync;

public class Counter {

    private int i = 0;

    public int getI() {
        return i;
    }

    public void incI() {
        synchronized (this) {
            i++;
        }
    }
}
