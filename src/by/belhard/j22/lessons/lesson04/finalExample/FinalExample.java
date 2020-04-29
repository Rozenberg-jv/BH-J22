package by.belhard.j22.lessons.lesson04.finalExample;

import by.belhard.j22.lessons.lesson03.personExample.Country;
import by.belhard.j22.lessons.lesson03.personExample.Person;
import by.belhard.j22.lessons.lesson03.personExample.Sex;

public class FinalExample {

    private static final int a = 5;

    private static final Person person = new Person("Vasily", 22,
            new Country("Belarus", 220000), Sex.MALE);


    public static void main(String[] args) {

        /*person = new Person("Vasily", 22,
                new Country("Belarus", 220000), Sex.MALE);*/

        person.setName("qqq");

        person.getCountry().setTitle("BLR");

    }
}
