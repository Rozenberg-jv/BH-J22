package by.belhard.j22.lessons.lesson09.warehouseExample.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static by.belhard.j22.lessons.lesson09.warehouseExample.Messages.CLOSE_VARIANT;

public class ConsoleView implements Viewable {

    private static final String INPUT_ERROR_MESSAGE = "Error while input";
    private static final String MENU_LEGEND =
            "\n" +
                    "1. show all good in storage\n" +
                    "2. add good to storage\n" +
                    "3. take off good from storage\n" +
                    CLOSE_VARIANT + ". exit\n";

    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void printMenuLegend() {
        System.out.println(MENU_LEGEND);
    }

    public String getStringLine() {

        String line = null;
        try {
            line = reader.readLine();
        } catch (IOException e) {
            System.err.println(INPUT_ERROR_MESSAGE);
        }

        return line;
    }

    public int getInt() {

        String line = getStringLine();

        return Integer.parseInt(line);
    }

    public void close() {

        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
