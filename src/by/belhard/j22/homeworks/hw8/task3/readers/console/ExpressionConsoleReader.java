package by.belhard.j22.homeworks.hw8.task3.readers.console;

import by.belhard.j22.homeworks.hw8.task3.readers.ExpressionReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExpressionConsoleReader implements ExpressionReader {

    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public String readExpression() throws IOException {

        return reader.readLine().replaceAll(" ", "");
    }

    @Override
    public void close() {

            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
