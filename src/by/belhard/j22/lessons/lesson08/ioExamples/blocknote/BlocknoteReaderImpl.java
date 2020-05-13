package by.belhard.j22.lessons.lesson08.ioExamples.blocknote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlocknoteReaderImpl implements BlocknoteReader {

    private final BufferedReader reader;

    public BlocknoteReaderImpl() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public String getLine() throws IOException {

        return reader.readLine();
    }

    @Override
    public void close() {
        try {
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
