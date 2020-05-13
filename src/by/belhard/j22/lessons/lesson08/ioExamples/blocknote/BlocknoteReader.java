package by.belhard.j22.lessons.lesson08.ioExamples.blocknote;

import java.io.Closeable;
import java.io.IOException;

public interface BlocknoteReader extends Closeable {

    String getLine() throws IOException;

    void close();
}
