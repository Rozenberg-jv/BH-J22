package by.belhard.j22.homeworks.hw3.task8;

public class Player {

    public static int playerCounter = 0;

    private int x,y;
    private String name;
    private double distance = 0;

    public Player(String name, int x, int y) {
        this.x = x;
        this.y = y;
        this.name = name;
        playerCounter++;
    }

    public Player(String name) {
        this(name, 0, 0);
        /*this.x = 0;
        this.y = 0;
        this.name = name;*/
    }

    public void printInfo() {
        System.out.println(name + " is on (" + x + ":"+ y+"), distance: " + distance);
    }

    public void move(int newX, int newY) {
        distance += calcDistance(newX, newY);

        this.x = newX;
        this.y = newY;
    }

    public void move(double newDistance, int times) {

        this.move(0, 0);
        distance = newDistance * times;
    }

    private double calcDistance(int newX, int newY) {

        return Math.sqrt(Math.pow(x-newX, 2) + Math.pow(y-newY, 2));
    }

    @Override
    public String toString() {
        return "Player{" +
                "x=" + x +
                ", y=" + y +
                ", name='" + name + '\'' +
                ", distance=" + distance +
                '}';
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getName() {
        return name;
    }

    public double getDistance() {
        return distance;
    }
}
