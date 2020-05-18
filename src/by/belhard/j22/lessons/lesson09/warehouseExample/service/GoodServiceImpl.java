package by.belhard.j22.lessons.lesson09.warehouseExample.service;

import by.belhard.j22.lessons.lesson09.warehouseExample.repository.GoodRepository;
import by.belhard.j22.lessons.lesson09.warehouseExample.repository.GoodRepositoryImpl;

public class GoodServiceImpl implements GoodService {

    private final GoodRepository goodRepository;

    public GoodServiceImpl() {
        this.goodRepository = new GoodRepositoryImpl();
    }
}
