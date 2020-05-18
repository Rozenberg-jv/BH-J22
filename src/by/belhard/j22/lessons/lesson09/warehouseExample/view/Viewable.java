package by.belhard.j22.lessons.lesson09.warehouseExample.view;

import java.io.IOException;

public interface Viewable {

    String CLOSE_VARIANT = "e";

    void printMenuLegend();

    String getStringLine() throws IOException;

    int getInt() throws IOException;
}
