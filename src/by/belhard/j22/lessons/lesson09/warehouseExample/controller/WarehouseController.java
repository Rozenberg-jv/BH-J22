package by.belhard.j22.lessons.lesson09.warehouseExample.controller;

import by.belhard.j22.lessons.lesson09.warehouseExample.service.GoodService;
import by.belhard.j22.lessons.lesson09.warehouseExample.service.GoodServiceImpl;
import by.belhard.j22.lessons.lesson09.warehouseExample.view.ConsoleView;
import by.belhard.j22.lessons.lesson09.warehouseExample.view.Viewable;

import static by.belhard.j22.lessons.lesson09.warehouseExample.Messages.CLOSE_VARIANT;

public class WarehouseController {

    private static final String NO_SUCH_VARIANT_MESSAGE = "There is no such variant, try again";
    private static final String NOT_A_NUMBER_MESSAGE = "You entered not valid data";
    private static final String PROPERTIES_PATH = "resources/warehouse.properties";

    private final GoodService goodService;
    private final Viewable view;

    public WarehouseController() {
        this.goodService = new GoodServiceImpl();
        this.view = new ConsoleView();
    }

    public void start() {

        /*Properties properties = new Properties();
        try {
            properties.load(new FileReader(PROPERTIES_PATH));
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        /*System.out.println(properties.getProperty("username"));
        System.out.println(properties.getProperty("qwe", "defaultString"));*/

//        goodService.loadDataFromStorage();

        String input = "";

        while (!input.equals(CLOSE_VARIANT)) {

            view.printMenuLegend();
            input = view.getStringLine();

            switch (input) {
                case "1":
                    goodService.showAllGoods();
                    break;
                case "2":
                    addGood();
                    break;
                case "3":
                    subtractGood();
                    break;
                case "4":
                    printGoodInfoByName();
                    break;
                case CLOSE_VARIANT:
//                    goodService.saveDataToStorage();
                    view.close();
                    System.out.println("Good bye!");
                    break;
                default:
                    System.err.println(NO_SUCH_VARIANT_MESSAGE);
                    break;
            }
        }
    }

    private void printGoodInfoByName() {

        goodService.printGoodInfoByName(view.getStringLine());
    }


    private void subtractGood() {
        System.out.println("Enter good name:");
        String goodName = view.getStringLine();
        int quantity;
        System.out.println("Enter good quantity:");
        try {
            quantity = view.getInt();
        } catch (NumberFormatException e) {
            System.err.println(NOT_A_NUMBER_MESSAGE);
            return;
        }

        goodService.subtractGood(goodName, quantity);
    }

    private void addGood() {
        System.out.println("Enter good name:");
        String goodName = view.getStringLine();
        int quantity;
        System.out.println("Enter good quantity:");
        try {
            quantity = view.getInt();
        } catch (NumberFormatException e) {
            System.err.println(NOT_A_NUMBER_MESSAGE);
            return;
        }

        goodService.addGood(goodName, quantity);
    }


}
