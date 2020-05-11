package by.belhard.j22.homeworks.hw6.task4;

import java.util.List;

public class EntityListHandler {

    public static Entity getByName(String name, List<Entity> list) {

        for (Entity entity : list) {
            if (entity.getName().equals(name)) {
                return entity;
            }
        }

        return null;
    }
}
