package by.belhard.j22.lessons.lesson09.warehouseExample.controller;

import by.belhard.j22.lessons.lesson09.warehouseExample.service.GoodService;
import by.belhard.j22.lessons.lesson09.warehouseExample.service.GoodServiceImpl;
import by.belhard.j22.lessons.lesson09.warehouseExample.view.ConsoleView;
import by.belhard.j22.lessons.lesson09.warehouseExample.view.Viewable;

public class WarehouseController {

    private final GoodService goodService;

    private final Viewable view;

    public WarehouseController() {
        this.goodService = new GoodServiceImpl();
        this.view = new ConsoleView();
    }

    public void start() {

        goodService.loadDataFromStorage();

        String input = "";

        while (!input.equals(Viewable.CLOSE_VARIANT)) {

            view.printMenuLegend();
            input = view.getStringLine();


        }

        goodService.saveDataToStorage();
    }
}
