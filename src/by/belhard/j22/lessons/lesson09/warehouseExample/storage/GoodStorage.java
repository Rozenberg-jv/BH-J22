package by.belhard.j22.lessons.lesson09.warehouseExample.storage;

import by.belhard.j22.lessons.lesson09.warehouseExample.model.GoodEntity;

import java.util.*;
import java.util.function.Consumer;

public class GoodStorage {

    public static final String STORAGE_FILE_PATH = "storage/goods.table";

    private final Map<String, GoodEntity> storage = new TreeMap<>(Comparator.naturalOrder());

    public void addToStorage(GoodEntity entity) {

        storage.compute(
                entity.getName(),
                (n, g) -> g == null ? entity : g.setQuantity(g.getQuantity() + entity.getQuantity()));
    }

    public void forEachGood(Consumer<GoodEntity> consumer) {

        storage.values().forEach(consumer);
    }

    public TreeSet<GoodEntity> getAll() {

        return new TreeSet<>(storage.values());
    }

    public boolean containsGood(String goodName) {

        return storage.containsKey(goodName);
    }

    public Optional<GoodEntity> getGoodByName(String goodName) {

        return Optional.ofNullable(storage.get(goodName));
    }
}
