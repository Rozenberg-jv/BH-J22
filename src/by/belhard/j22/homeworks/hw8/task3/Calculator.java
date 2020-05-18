package by.belhard.j22.homeworks.hw8.task3;

import by.belhard.j22.homeworks.hw8.task3.exceptions.NoSuchOperatorException;
import by.belhard.j22.homeworks.hw8.task3.readers.console.ExpressionConsoleReader;
import by.belhard.j22.homeworks.hw8.task3.readers.ExpressionReader;
import by.belhard.j22.homeworks.hw8.task3.readers.file.ExpressionFileReader;

import java.io.IOException;

public class Calculator {

    private final ExpressionReader expressionReader;

    public Calculator() {

        this.expressionReader = new ExpressionConsoleReader();
    }

    public Calculator(String fileName) {

        this.expressionReader = new ExpressionFileReader(fileName);
    }

    public void start() {

        ExpressionReader.exampleStaticMethod();
        expressionReader.exampleDefaultMethod();
        System.out.println();

        String input = "";

        while (!input.equals("exit") || !input.equals("\n")) {
            try {
                input = expressionReader.readExpression();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                calcExpression(input);
            } catch (NoSuchOperatorException e) {
                System.err.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.err.println("NumberFormatException: " + e.getMessage());
            }
        }

        expressionReader.close();
    }

    private void calcExpression(String input) throws NumberFormatException {

        String operator = input.replaceAll("\\d*", "");

        SimpleArithmeticOperation simpleArithmeticOperation = getOperator(operator);

        String[] split = input.split("[/*\\-+]");

        int a1 = Integer.parseInt(split[0]);
        int a2 = Integer.parseInt(split[1]);

        System.out.println(simpleArithmeticOperation.calc(a1, a2));
    }

    private SimpleArithmeticOperation getOperator(String operator) throws NoSuchOperatorException {

        SimpleArithmeticOperation simpleArithmeticOperation;

        switch (operator) {
            case "+":
                simpleArithmeticOperation = (c1, c2) -> c1 + c2;
                break;
            case "-":
                simpleArithmeticOperation = (c1, c2) -> c1 - c2;
                break;
            case "*":
                simpleArithmeticOperation = (c1, c2) -> c1 * c2;
                break;
            case "/":
                simpleArithmeticOperation = (c1, c2) -> c1 / c2;
                break;
            default:
                throw new NoSuchOperatorException(operator);
        }

        return simpleArithmeticOperation;
    }
}
