package by.belhard.j22.lessons.lesson09.warehouseExample.repository;

import by.belhard.j22.lessons.lesson09.warehouseExample.model.GoodEntity;

import java.util.Collection;

public interface GoodRepository {

    Collection<GoodEntity> getAllGoods();

    void loadData();

    void saveData();

    void changeGoodQuantity(String goodName, int quantity);

    boolean containsGood(String goodName);

    GoodEntity getGoodByName(String name);
}
