package by.belhard.j22.lessons.lesson06.exampleTask;

public class Rectangle extends Square implements Calculatable{

    private final double b;

    @Override
    public double calcArea() {
        return getA() * b;
    }

    @Override
    public double calcPerimeter() {
        return 2 * (getA() + b);
    }

    public Rectangle(double a, double b) {
        super(a);
        this.b = b;
    }

    public double getB() {
        return b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + getA() +
                "b=" + b +
                '}';
    }
}
