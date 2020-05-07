package by.belhard.j22.lessons.lesson06.exampleTask;

public class Circle implements Calculatable{

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calcArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double calcPerimeter() {
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
