package by.belhard.j22.lessons.lesson08.exceptionExample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

public class ExceptionExample {

    public static void main(String[] args) {

        int a = 5;
        int b = 0;

        int c = 0;
        try {
            c = calcWithException(a, b);
            System.out.println("end of try block");
            checkedException();
        } catch (ArithmeticException | FileNotFoundException e) {
            System.err.println("ERROR");
            try {
                throw new RuntimeException();
            } catch (RuntimeException e2) {
                System.err.println("inner exception");
            } finally {
                System.err.println("inner finally");
            }
        } catch (RuntimeException e) {
            System.err.println("RuntimeException");
        } finally {
            System.err.println("FINALLY");
        }

        System.out.println(c);
    }

    private static int calcWithException(int a, int b) {

        int c = 0;

        c = a / b;

        return c;
    }

    public static void checkedException() throws FileNotFoundException {

        InputStreamReader r = new FileReader("ab");
    }
}
