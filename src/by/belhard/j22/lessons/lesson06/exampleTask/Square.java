package by.belhard.j22.lessons.lesson06.exampleTask;

public class Square implements Calculatable{

    private final double a;

    @Override
    public double calcArea() {
        return a*a;
    }

    @Override
    public double calcPerimeter() {
        return a*4;
    }

    public Square(double a) {

        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }
}
