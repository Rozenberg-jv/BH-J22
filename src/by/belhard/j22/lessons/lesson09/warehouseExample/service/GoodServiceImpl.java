package by.belhard.j22.lessons.lesson09.warehouseExample.service;

import by.belhard.j22.lessons.lesson09.warehouseExample.model.GoodEntity;
import by.belhard.j22.lessons.lesson09.warehouseExample.repository.GoodRepository;
import by.belhard.j22.lessons.lesson09.warehouseExample.repository.GoodRepositoryImpl;
import by.belhard.j22.lessons.lesson09.warehouseExample.repository.NoEntityFoundException;

public class GoodServiceImpl implements GoodService {

    private static final String NO_SUCH_GOOD_MESSAGE = "There is no such good in storage";
    private final GoodRepository goodRepository;

    public GoodServiceImpl() {
        this.goodRepository = new GoodRepositoryImpl();
    }

    @Override
    public void showAllGoods() {

        System.out.print(String.format(GoodEntity.GOODS_TABLE_FORMAT, "NAME", "QUANTITY"));
        goodRepository.getAllGoods().forEach(g -> System.out.print(g.formatForPrint()));
    }

    @Override
    public void loadDataFromStorage() {

        goodRepository.loadData();
    }

    @Override
    public void saveDataToStorage() {

        goodRepository.saveData();
    }

    @Override
    public void addGood(String goodName, int quantity) {

        quantity = Math.abs(quantity);

        goodRepository.changeGoodQuantity(goodName, quantity);
    }

    @Override
    public void subtractGood(String goodName, int quantity) {

        quantity = Math.abs(quantity);

        if (!goodRepository.containsGood(goodName)) {
            System.out.println(NO_SUCH_GOOD_MESSAGE);
            return;
        }

        goodRepository.changeGoodQuantity(goodName, -quantity);
    }

    @Override
    public void printGoodInfoByName(String name) {

        try {
            System.out.println(goodRepository.getGoodByName(name).formatForPrint());
        } catch (NoEntityFoundException e) {
            System.err.println("No such entity found");
        }
    }
}
