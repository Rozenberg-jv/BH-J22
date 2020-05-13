package by.belhard.j22.lessons.lesson08.exceptionExample;

public class OwnExceptionExample {

    public static void main(String[] args) {

        int a = 5, b = 0;

        try {
            System.out.println(divide(a, b));
        } catch (ZeroBException e) {
            System.out.println("Division by zero");
        }

    }

    public static int divide(int a, int b) {

        if (b == 0)
            throw new ZeroBException();

        return a / b;
    }
}
