package by.belhard.j22.homeworks.hw3.task5;

public class HundredStreamTask {

    public static void main(String[] args) {

        // 3 & 7
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        // 5 ^ 7
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                if (i % 5 == 0 && i % 7 == 0) {
                    continue;
                }
                System.out.print(i + " ");
            }
        }
        System.out.println();
        // 5 ^ 7
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 ^ i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        
        // 10-19, 30-39..
        for (int i = 1; i <= 100; i++) {
            if (i / 10 % 2 == 1) {
                if (i % 5 == 0 ^ i % 7 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
