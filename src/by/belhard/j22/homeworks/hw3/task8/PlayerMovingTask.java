package by.belhard.j22.homeworks.hw3.task8;

//import java.time.LocalDate;

public class PlayerMovingTask {

    public static void main(String[] args) {

        System.out.println("players count: " + Player.playerCounter);
        Player pl1 = new Player("Vasily", 0,0);
        System.out.println("players count: " + Player.playerCounter);
        pl1.printInfo();
        pl1.move(3,4);
        pl1.printInfo();
        pl1.move(-3,-4);
        pl1.printInfo();
        pl1.move(10.0, 5);
        pl1.printInfo();

        Player pl2 = new Player("Tatyana");
        System.out.println("players count: " + Player.playerCounter);


        /*int year = LocalDate.now().getYear();
        long l = System.currentTimeMillis();
        System.out.println(year);
        System.out.println(System.currentTimeMillis() - l);*/
    }
}
