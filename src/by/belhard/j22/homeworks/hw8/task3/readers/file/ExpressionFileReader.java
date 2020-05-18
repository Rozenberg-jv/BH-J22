package by.belhard.j22.homeworks.hw8.task3.readers.file;

import by.belhard.j22.homeworks.hw8.task3.readers.ExpressionReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExpressionFileReader implements ExpressionReader {

    private final BufferedReader reader;

    private final String fileName;

    public ExpressionFileReader(String fileName) {
        this.fileName = fileName;

        try {
            reader = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("No file to read!");
        }
    }

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
