package by.belhard.j22.lessons.lesson04.stringExample;

import by.belhard.j22.homeworks.hw3.task8.Player;

public class StringExample {

    public static void main(String[] args) {

        int i = 100;

        System.out.println(i); // "100"

        Player player = new Player("Vasily", 10, 25);
        player.move(11,2);
        System.out.println(player);

        System.out.println(player.getName() + " " + player.getDistance()
                + " (" + player.getX() + ":"+player.getY()+")");

        System.out.printf("%-10s - %.2f - (%d:%d)", player.getName(), player.getDistance(),
                player.getX(), player.getY());
    }
}
