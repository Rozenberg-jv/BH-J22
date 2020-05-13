package by.belhard.j22.lessons.lesson08.ioExamples.blocknote;

import java.io.IOException;

public class Blocknote {

    private final BlocknoteReader reader;
    private final BlocknoteWriter writer;

    public Blocknote() {
        this.reader = new BlocknoteReaderImpl();
        this.writer = new BlocknoteWriterImpl();
    }

    public void useBlocknote() {

        String input = "";
        int sum = 0;

        do {
            try {
                input = reader.getLine();
                sum += Integer.parseInt(input);
                writer.writeLine(String.valueOf(sum));
            } catch (NumberFormatException e) {
                System.err.println("Wrong input!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (!input.equals("exit"));

        reader.close();
        writer.close();

        System.out.println("GOOD BYE!");
    }
}
