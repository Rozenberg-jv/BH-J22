package by.belhard.j22.homeworks.hw6.task5;

import by.belhard.j22.homeworks.hw6.task4.Entity;

import java.util.*;

public class Task5 {

    public static void main(String[] args) {

        Map<Entity, List<String>> map = new HashMap<>();
        map.put(new Entity("Vasily"), Arrays.asList("bread", "bread", "milk", "pelmeni"));
        map.put(new Entity("Olga"), Arrays.asList("bread", "milk", "pelmeni"));
        map.put(new Entity("Igor"), Arrays.asList("bear", "bear", "bear", "bear"));
        map.put(new Entity("Marina"), Arrays.asList("bear", "bear"));

        Map<String, Integer> productsCount = EntityMapHandler.getProductsCount(map);

        productsCount.forEach((k,v) -> System.out.println(k + " : " + v));
    }
}
