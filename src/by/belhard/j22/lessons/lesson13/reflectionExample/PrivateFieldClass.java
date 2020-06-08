package by.belhard.j22.lessons.lesson13.reflectionExample;

public class PrivateFieldClass {

    private int a;

    public PrivateFieldClass(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    @Override
    public String toString() {
        return "PrivateFieldClass{" +
                "a=" + a +
                '}';
    }
}
