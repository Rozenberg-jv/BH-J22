package by.belhard.j22.lessons.lesson06.exampleTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task {

    public static void main(String[] args) {

        List<Calculatable> list = new ArrayList<>();
        list.add(new Circle(1));
        list.add(new Square(10));
        list.add(new Rectangle(5,2));

        for (Calculatable calculatable : list) {
            System.out.println(calculatable);
            System.out.println(calculatable.calcArea());
            System.out.println(calculatable.calcPerimeter());
        }

        Map<String, List<? super Calculatable>> map = new HashMap<>();
        map.put("circle", new ArrayList<>());
        map.put("square", new ArrayList<>());
        map.put("rectangle", new ArrayList<>());

        map.get("circle").add(new Circle(5));
        map.get("circle").add(new Circle(10));
        map.get("circle").add(new Circle(1));

        map.get("square").add(new Square(1));
        map.get("square").add(new Square(10));
        map.get("square").add(new Square(4));

        map.get("rectangle").add(new Rectangle(1, 2));

        System.out.println();

        System.out.println(((Calculatable) map.get("square").get(2)).calcArea());
    }
}
