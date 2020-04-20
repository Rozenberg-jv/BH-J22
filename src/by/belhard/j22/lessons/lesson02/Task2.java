package by.belhard.j22.lessons.lesson02;

public class Task2 {

    public static void main(String[] args) {

        int a = -10;

        if (a <= 5) {
            System.out.println("a > 5");
            a *= 2;
            System.out.println("a twice: " + a);
        } else if (a <= 10) {
            System.out.println("a <= 10");
        } else {
            System.out.println("a > 10");
        }


        System.out.println("end of program");
    }
}
