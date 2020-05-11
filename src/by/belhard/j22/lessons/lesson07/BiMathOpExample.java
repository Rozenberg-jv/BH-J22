package by.belhard.j22.lessons.lesson07;

public class BiMathOpExample {

    public static void main(String[] args) {

        BiMathOperator sum = (a, b) -> a + b;
        BiMathOperator sub = (a, b) -> a - b;

        System.out.println(calculate(1, 5, sum));
        System.out.println(calculate(1, 5, sub));


    }

    private static int calculate(int a, int b, BiMathOperator operator) {

        return operator.apply(a, b);
    }
}
