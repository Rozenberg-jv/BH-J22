package by.belhard.j22.homeworks.hw8.task3;

public class Task3 {

    public static void main(String[] args) {

       Calculator calc = new Calculator();

//        calc.start();

        calc = new Calculator("resources/expression.exp");

        calc.start();

    }
}
