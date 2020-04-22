package by.belhard.j22.lessons.lesson03;

public class Task {

    public static void main(String[] args) {

        /*int a = 0b11000011110;
        int b = 0x127;

        int c = 0x61E;

        System.out.println(Integer.toHexString(a));
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);*/

        int a = 2;
        int n = 3;
        int r = a;

        for (int i = 0; i < n - 1; i++) {
            r *= a;
        }

        System.out.println(r);

    }
}
