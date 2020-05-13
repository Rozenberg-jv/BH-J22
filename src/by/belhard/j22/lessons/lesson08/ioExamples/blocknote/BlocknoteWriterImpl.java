package by.belhard.j22.lessons.lesson08.ioExamples.blocknote;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class BlocknoteWriterImpl implements BlocknoteWriter {

    private BufferedWriter writer;

    public BlocknoteWriterImpl() {

        String fileName = String.valueOf(LocalDateTime.now().getMinute());

        try {
            this.writer = new BufferedWriter(
                    new FileWriter("resources/blocknote" + fileName, true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void writeLine(String line) throws IOException {

        writer.write(line);
        writer.newLine();
    }

    @Override
    public void close() {
        try {
            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
