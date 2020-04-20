package by.belhard.j22.lessons.lesson02;

public class Task3 {

    public static void main(String[] args) {

        int tmp = 0;
        int n = 5;

        for (int i = 0; i < n; i++) {

            System.out.print(i * 2);

            if (i == n - 2)
                tmp = i;
        }

        System.out.println(" ------- ");

        System.out.println(tmp);
    }
}
