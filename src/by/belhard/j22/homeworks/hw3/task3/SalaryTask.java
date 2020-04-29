package by.belhard.j22.homeworks.hw3.task3;

public class SalaryTask {

    public static void main(String[] args) {

        int salary1 = 400,salary2 = 400,salary3 = 400;

        /*int min = salary1, max = salary1;

        if (salary2 > max)
            max = salary2;
        if (salary3 > max)
            max = salary3;

        if (salary2 < min)
            min = salary2;
        if (salary3 < min)
            min = salary3;*/

        int max = Math.max(salary1, Math.max(salary2, salary3));
        int min = Math.min(salary1, Math.min(salary2, salary3));

        System.out.println("salary difference: " + (max - min));


    }
}
