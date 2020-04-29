package by.belhard.j22.homeworks.hw3.task4;

public class BankTask {

    public static void main(String[] args) {

        int startSum = 1000;
        int proc = 10;
        int year = 5;

        double sum = startSum;

        for (int i = 0; i < year; i++) {

            sum += sum * proc / 100;
            System.out.println((i+1)+" year sum = " + sum);
        }


    }
}
