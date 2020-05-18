package by.belhard.j22.homeworks.hw8.task3.readers;

import java.io.IOException;

public interface ExpressionReader {

    String readExpression() throws IOException;

    void close();

    static void exampleStaticMethod() {
        System.out.println("Static method");
    }

    default void exampleDefaultMethod() {
        System.out.println("Default method");
        examplePrivateMethod();
    }

    private void examplePrivateMethod() {
        System.out.println("Private method");
    }
}
