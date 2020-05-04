package by.belhard.j22.homeworks.hw4.task5;

public class WardrobeTask {

    public static void main(String[] args) {

        Wardrobe wardrobe = new Wardrobe(4);

        wardrobe.lookIntoWardrobe();

        wardrobe.putItemOnShelf(new Clothes("socks"), 1);

        wardrobe.lookIntoWardrobe();

        wardrobe.putItemOnShelf(new Clothes("hat"));
        wardrobe.putItemOnShelf(new Clothes("pants"));

        wardrobe.lookIntoWardrobe();

        System.out.println(wardrobe.getItemFromShelf(3));

        Clothes quaziHat = wardrobe.getItemFromShelf(0);

        System.out.println(quaziHat);
        System.out.println();

        wardrobe.lookIntoWardrobe();
    }
}
