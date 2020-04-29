package by.belhard.j22.lessons.lesson04.staticexample;

public class StaticExample {

    public static void main(String[] args) {

        /*StaticCounter staticCounter1 = new StaticCounter();
        StaticCounter staticCounter2 = new StaticCounter();*/

        StaticCounter.inc();
        System.out.println(StaticCounter.getI());
        System.out.println(StaticCounter.getI());
        StaticCounter.inc();

        System.out.println(StaticCounter.getI());
        System.out.println(StaticCounter.getI());
    }
}
