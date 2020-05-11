package by.belhard.j22.homeworks.hw6.task5;

import by.belhard.j22.homeworks.hw6.task4.Entity;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EntityMapHandler {

    public static Map<String, Integer> getProductsCount(
            Map<Entity, List<String>> map) {

        Map<String, Integer> result = new HashMap<>();

        Collection<List<String>> values = map.values();

        for (List<String> list : values) {
            for (String product : list) {
                if (result.containsKey(product)) {
                    result.put(product, result.get(product) + 1);
                } else {
                    result.put(product, 1);
                }
            }
        }

        return result;
    }
}
