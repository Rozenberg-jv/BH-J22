package by.belhard.j22.lessons.lesson07;

import by.belhard.j22.homeworks.hw6.task4.Entity;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIExample {

    public static void main(String[] args) {

        List<Entity> list = Arrays.asList(
                new Entity("Vasily"),
                new Entity("Olga"),
                new Entity("Anna"),
                new Entity("Nikolay"),
                new Entity("Ivan")
        );

        String collect = list.stream()
//                .filter(e -> e.getName().length() < 5)
                .sorted((e1, e2) -> e1.getName().length() - e2.getName().length())
                /*.sorted(new Comparator<>() {
                    @Override
                    public int compare(Entity entity, Entity t1) {
                        return entity.getName().length() - t1.getName().length();
                    }
                })*/
                .peek(e -> e.setName(e.getName().toUpperCase()))
                .map(Entity::getName)
                .collect(Collectors.joining(", ", "start ", " end"));

        /*List<Entity> collect = list.stream()
                .filter(e -> e.getName().length() < 5)
                .peek(e -> e.setName(e.getName().toUpperCase()))
                .collect(Collectors.toList());*/

        System.out.println(collect);
        System.out.println();
        list.forEach(System.out::println);
    }
}
