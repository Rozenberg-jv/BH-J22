package by.belhard.j22.lessons.lesson06.collections;

import by.belhard.j22.lessons.lesson05.inheritanceExample.Person;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {

        Set<Person> set = new HashSet<>();

        set.add(new Person("Vasily", 25));
        set.add(new Person("Vasily", 25));
        set.add(new Person("Vasily", 25));
        set.add(new Person("Olga", 30));
        set.add(new Person("Vasily", 25));
        set.add(new Person("Vasily", 25));

        System.out.println(set);
        System.out.println();

        set = new TreeSet<>(new PersonComparator());
        set.add(new Person("Vasily", 25));
        set.add(new Person("Ivan", 15));
        set.add(new Person("Vasily", 35));
        set.add(new Person("Boris", 35));
        set.add(new Person("Vasily", 55));
        set.add(new Person("Olga", 35));

        System.out.println(set);
        System.out.println();

        set = new TreeSet<>();
        set.add(new Person("Vasily", 25));
        set.add(new Person("Ivan", 15));
        set.add(new Person("Vasily", 35));
        set.add(new Person("Boris", 35));
        set.add(new Person("Vasily", 55));
        set.add(new Person("Olga", 35));
        System.out.println(set);
        System.out.println();


    }
}
