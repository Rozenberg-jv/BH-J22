package by.belhard.j22.homeworks.hw3.task6;

import java.util.Arrays;

public class ArrayTask {

    public static void main(String[] args) {

        int[] intArray = {1,1,1,1,1,1,1,1,10,1000};
//        int[] intArray = {1,5,11,-2,-100,13,2,5,1,10};

        int sum = 0, avg = 0, med = 0;

        for (int i : intArray) {

            sum += i;
        }

        System.out.println("sum: " + sum);
        avg = sum / intArray.length;
        System.out.println("avg: " + avg);
        Arrays.sort(intArray); // сортировка массива

        /*if (intArray.length % 2 == 0) {
            med = (intArray[intArray.length/2-1] + intArray[intArray.length/2]) / 2;
        } else {
            med = intArray[intArray.length/2];
        }*/
        med = intArray.length % 2 == 0 ?
                (intArray[intArray.length/2-1] + intArray[intArray.length/2]) / 2 :
                intArray[intArray.length/2];

        System.out.println("med: " + med);


    }
}
