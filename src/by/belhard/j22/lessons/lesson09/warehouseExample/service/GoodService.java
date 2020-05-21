package by.belhard.j22.lessons.lesson09.warehouseExample.service;

public interface GoodService {

    void showAllGoods();

    void loadDataFromStorage();

    void saveDataToStorage();

    void addGood(String goodName, int quantity);

    void subtractGood(String goodName, int quantity);

    void printGoodInfoByName(String name);
}
