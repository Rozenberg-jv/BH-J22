package by.belhard.j22.homeworks.hw8.task3.exceptions;

public class NoSuchOperatorException extends RuntimeException {

    public NoSuchOperatorException(String operator) {
        super("No such operator: " + operator);
    }
}
