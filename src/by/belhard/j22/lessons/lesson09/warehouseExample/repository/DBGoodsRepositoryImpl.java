package by.belhard.j22.lessons.lesson09.warehouseExample.repository;

import by.belhard.j22.lessons.lesson09.warehouseExample.model.GoodEntity;
import by.belhard.j22.lessons.lesson09.warehouseExample.service.DBGoodRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBGoodsRepositoryImpl implements DBGoodRepository {

    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/bhj22";
    private static final String DB_USERNAME = "admin";
    private static final String DB_PASSWORD = "guard1an";

    private static final Connection connection;

    static {
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new RuntimeException();
        }
    }


    @Override
    public void addNewGood(String goodName, int quantity) throws SQLException {

        Statement statement = connection.createStatement();

        boolean result = statement.execute(String.format(
                GoodQueries.ADD_NEW_GOOD_QUERY,
                goodName,
                quantity));

        System.out.println("addNewGood: " + result);
    }

    public void updateGood(String goodName, int quantity) throws SQLException {

        PreparedStatement statement = connection.prepareStatement(GoodQueries.UPDATE_GOOD_QUERY);

        statement.setInt(1, quantity);
        statement.setString(2, goodName);

        int result = statement.executeUpdate();
        System.out.println("updateGood:" + result);
    }

    @Override
    public List<GoodEntity> getAllGoods() throws SQLException {

        List<GoodEntity> result = new ArrayList<>();

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(GoodQueries.GET_ALL_QUERY);

        while (resultSet.next()) {

            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int quantity = resultSet.getInt("quantity");

            result.add(GoodEntity.builder().id(id).name(name).quantity(quantity).build());
        }

        return result;
    }
}
