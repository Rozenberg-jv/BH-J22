package by.belhard.j22.lessons.lesson04.staticexample;

public class StaticCounter {

    private static int i = 0;

    private int a = 100;

    public void printSmthing() {
        System.out.println(i);
    }

    public static void inc() {
        i++;
    }

    public static int getI() {
//        a++;
        return i;
    }
}
