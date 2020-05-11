package by.belhard.j22.homeworks.hw6.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {

    public static void main(String[] args) {

        List<Entity> list = new ArrayList();

        list.add(new Entity("Vasily"));
        list.add(new Entity("Olga"));
        list.add(new Entity("Egor"));
        list.add(new Entity("NotABoris"));
        list.add(new Entity("Marina"));

        Entity entity = EntityListHandler.getByName("Boris", list);

        System.out.println(entity == null ? "noname" : entity.getName());
    }
}
