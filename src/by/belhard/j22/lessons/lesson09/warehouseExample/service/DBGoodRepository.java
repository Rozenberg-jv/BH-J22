package by.belhard.j22.lessons.lesson09.warehouseExample.service;

import by.belhard.j22.lessons.lesson09.warehouseExample.model.GoodEntity;

import java.sql.SQLException;
import java.util.List;

public interface DBGoodRepository {

    void addNewGood(String goodName, int quantity) throws SQLException;

    void updateGood(String goodName, int quantity) throws SQLException;

    List<GoodEntity> getAllGoods() throws SQLException;
}
