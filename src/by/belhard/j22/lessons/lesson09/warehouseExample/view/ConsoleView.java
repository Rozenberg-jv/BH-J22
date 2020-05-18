package by.belhard.j22.lessons.lesson09.warehouseExample.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleView implements Viewable{

    private static final String MENU_LEGEND =
            "1. method1\n" +
                    "2. method2\n" +
                    "3. method3\n" +
                    "e. exit\n";

    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void printMenuLegend() {
        System.out.println(MENU_LEGEND);
    }

    public String getStringLine() throws IOException {
        return reader.readLine();
    }

    public int getInt() throws IOException {
        return Integer.parseInt(reader.readLine());
    }

    public void close() {

        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
