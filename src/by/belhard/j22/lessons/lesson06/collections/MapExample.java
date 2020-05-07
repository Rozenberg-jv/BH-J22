package by.belhard.j22.lessons.lesson06.collections;

import by.belhard.j22.lessons.lesson05.inheritanceExample.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<String, Person> map = new HashMap<>();

        Person person1 = new Person("Vasily", 25);
        Person person2 = new Person("Olga", 35);
        Person person3 = new Person("Ivan", 45);
        Person person4 = new Person("Roman", 15);
        Person person5 = new Person("Vasily", 25);

        System.out.println(person1.hashCode());
        System.out.println(person5.hashCode());

        map.put(person1.getName(), person1);
        map.put(person2.getName(), person2);
        map.put(person3.getName(), person3);
        map.put(person4.getName(), person4);
        map.put(person5.getName()+"2", person5);

        System.out.println(map.get("Vasily").hashCode());
        System.out.println(map.size());

        Map<String, List<Person>> mapOfList = new HashMap<>();


    }
}
