package by.belhard.j22.lessons.lesson07;

import by.belhard.j22.homeworks.hw6.task4.Entity;

import java.util.Comparator;

public class EntityComparator implements Comparator<Entity> {

    @Override
    public int compare(Entity entity, Entity t1) {
        return entity.getName().length() - t1.getName().length();
    }
}
