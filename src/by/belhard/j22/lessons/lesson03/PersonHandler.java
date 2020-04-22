package by.belhard.j22.lessons.lesson03;

import by.belhard.j22.lessons.lesson03.personExample.Country;
import by.belhard.j22.lessons.lesson03.personExample.Person;
import by.belhard.j22.lessons.lesson03.personExample.Sex;

public class PersonHandler {

    public static void main(String[] args) {

        Person person1 = new Person(
                "Vasily",
                30,
                new Country("Belarus", 220000),
                Sex.MALE
        );

        /*person1.setName("Vasily");
        person1.age = 30;
        person1.country = new Country();
        person1.sex = Sex.MALE;
        person1.country.title = "Belarus";
        person1.country.zipCode = 220000;*/

        System.out.println(person1.getName() + " : " + person1.getAge());
        System.out.println(
                person1.getCountry().getTitle() + " "
                        + person1.getCountry().getZipCode());

        //
        System.out.println();
        Person person2 = new Person(
                "Olga",
                20,
                person1.getCountry(),
                Sex.FEMALE
        );
       /* person2.name = "Olga";
        person2.age = 29;
        person2.country = person1.country;
        person2.sex = Sex.FEMALE;*/

        System.out.println(
                person2.getCountry().getTitle() +" "
                        + person2.getCountry().getZipCode());

        person1.setCountry(new Country("Belarus", 220000));
        person2.getCountry().setTitle("BLR");

//        System.out.println(person1.country.title + person1.country.zipCode);
        System.out.println(
                person1.getCountry().getTitle() +" "
                        + person1.getCountry().getZipCode());

        person1.walk();
        person1.eat("bread");
        System.out.println(person1.growOld());
        int newAge = person1.growOld();
        System.out.println(newAge);


    }
}
