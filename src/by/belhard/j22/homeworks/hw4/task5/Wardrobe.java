package by.belhard.j22.homeworks.hw4.task5;

public class Wardrobe {

    private static final String ERROR_MESSAGE = "Invalid input data";

    private final Clothes[] shelves;

    public Wardrobe(int numberOfShelves) {

        if (numberOfShelves <= 0)
            numberOfShelves = 3;

        this.shelves = new Clothes[numberOfShelves];
    }

    public void putItemOnShelf(Clothes clothes, int shelfNumber) {

        if (validateShelfNumber(shelfNumber)) {

            if (shelves[shelfNumber] == null) {
                shelves[shelfNumber] = clothes;
            } else {
                System.out.println("Shelf is not empty");
            }
        } else {
            System.out.println(ERROR_MESSAGE);
        }
    }

    public void putItemOnShelf(Clothes clothes) {

        for (int i = 0; i < shelves.length; i++) {
            if (shelves[i] == null) {
                shelves[i] = clothes;
                return;
            }
        }

        System.out.println("There is no empty shelf");
    }

    public Clothes getItemFromShelf(int shelfNumber) {

        Clothes result = null;

        if (validateShelfNumber(shelfNumber)) {

            if (shelves[shelfNumber] == null) {
                System.out.println("The shelf is empty");
            } else {
                result = shelves[shelfNumber];
                shelves[shelfNumber] = null;
            }
        } else {
            System.out.println(ERROR_MESSAGE);
        }

        return result;
    }

    public void lookIntoWardrobe() {

        for (int i = 0; i < shelves.length; i++) {
            System.out.printf("%d) %s\n",
                    (i+1),
                    shelves[i] != null ? shelves[i] : "empty");
        }
        System.out.println();
    }

    private boolean validateShelfNumber(int shelfNumber) {

        return shelfNumber >= 0 && shelfNumber < shelves.length;
    }
}
