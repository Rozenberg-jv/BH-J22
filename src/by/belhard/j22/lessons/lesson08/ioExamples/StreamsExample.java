package by.belhard.j22.lessons.lesson08.ioExamples;

import java.io.*;

public class StreamsExample {

    public static void main(String[] args) {

        File file = new File("input.qqq");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter wrt = new BufferedWriter(new FileWriter(file, true))) {

            wrt.write("abc");
            wrt.newLine();
            wrt.write(97);
            wrt.write(98);
            wrt.write(99);

            wrt.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader is = new BufferedReader(new FileReader(file))){

            String read;

            while (is.ready()) {
                read = is.readLine();
                System.out.println(read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
