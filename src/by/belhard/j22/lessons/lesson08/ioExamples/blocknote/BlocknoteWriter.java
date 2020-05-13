package by.belhard.j22.lessons.lesson08.ioExamples.blocknote;

import java.io.Closeable;
import java.io.IOException;

public interface BlocknoteWriter extends Closeable {

    void writeLine(String line) throws IOException;

    void close();
}
