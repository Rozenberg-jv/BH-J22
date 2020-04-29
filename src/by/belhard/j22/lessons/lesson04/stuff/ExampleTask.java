package by.belhard.j22.lessons.lesson04.stuff;

import java.util.Random;

public class ExampleTask {

    public static void main(String[] args) {

        Integer in = null;
        Boolean b = true;

        String s = "1234";

        System.out.println(Integer.parseInt(s)*20);

        System.out.println(in);

        Random random = new Random();

        for (int i = 0; i < 20; i++)
            System.out.println(random.nextInt());

        System.out.println();

        for (int i = 0; i < 20; i++)
            System.out.println(random.nextInt(10));

        double random1 = Math.random();

        System.out.println(random1);
    }
}
