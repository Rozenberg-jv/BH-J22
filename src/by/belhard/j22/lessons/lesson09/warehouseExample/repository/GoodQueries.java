package by.belhard.j22.lessons.lesson09.warehouseExample.repository;

public interface GoodQueries {

    String ADD_NEW_GOOD_QUERY = "insert into goods value (null, '%s', %d);";
    String UPDATE_GOOD_QUERY = "update goods set quantity = ? where name = ?;";
    String GET_ALL_QUERY = "select * from goods;";
    String GET_ALL_QUERY2 = "select name as n, quantity as q, id as i from goods;";
}