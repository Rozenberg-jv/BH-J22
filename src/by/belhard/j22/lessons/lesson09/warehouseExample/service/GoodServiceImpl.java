package by.belhard.j22.lessons.lesson09.warehouseExample.service;

import by.belhard.j22.lessons.lesson09.warehouseExample.model.GoodEntity;
import by.belhard.j22.lessons.lesson09.warehouseExample.repository.DBGoodsRepositoryImpl;

import java.sql.SQLException;

public class GoodServiceImpl implements GoodService {

    private static final String NO_SUCH_GOOD_MESSAGE = "There is no such good in storage";
    private final DBGoodRepository goodRepository;

    public GoodServiceImpl() {
        this.goodRepository = new DBGoodsRepositoryImpl();
    }

    @Override
    public void showAllGoods() {

        System.out.print(String.format(GoodEntity.GOODS_TABLE_FORMAT, "ID", "NAME", "QUANTITY"));
        try {
            goodRepository.getAllGoods().forEach(g -> System.out.print(g.formatForPrint()));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void loadDataFromStorage() {

//        goodRepository.loadData();
    }

    @Override
    public void saveDataToStorage() {

//        goodRepository.saveData();
    }

    @Override
    public void addGood(String goodName, int quantity) {

        quantity = Math.abs(quantity);

        try {
            goodRepository.addNewGood(goodName, quantity);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void subtractGood(String goodName, int quantity) {

        quantity = Math.abs(quantity);

        /*if (!goodRepository.containsGood(goodName)) {
            System.out.println(NO_SUCH_GOOD_MESSAGE);
            return;
        }*/

        try {
            goodRepository.updateGood(goodName, quantity);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void printGoodInfoByName(String name) {

        /*try {
            System.out.println(goodRepository.getGoodByName(name).formatForPrint());
        } catch (NoEntityFoundException e) {
            System.err.println("No such entity found");
        }*/
    }
}
