package by.belhard.j22.lessons.lesson05.inheritanceExample;

public class InheritanceExample {

    public static void main(String[] args) {

        Person person = new Person("Vasily", 20);
        System.out.println(person.getName() + " " + person.getAge());
        System.out.println(person);
        System.out.println();

        Worker worker = new Worker("Gennady", 40, "MAZ");
        System.out.println(worker.getFactoryName());
        System.out.println(worker.getName() + " " + worker.getAge());
        System.out.println(worker);
        System.out.println();

        Manager manager = new Manager("Olga", 25, 123456);
        System.out.println(manager.getName() + " " + manager.getAge() + " " +
                manager.getPhoneNumber());
        System.out.println(manager);
        System.out.println();

        Person person2 = new Worker("Romuald", 55, "MTZ");

//        person2 = manager;
        System.out.println(person2.getAge() + ((Worker)person2).getFactoryName());

        System.out.println(worker.hashCode());

        //
        System.out.println();
        person.work();
        worker.work();
        manager.work();
        person2.work();

        System.out.println();
        Class<? extends Worker> aClass = worker.getClass();
        System.out.println(person.toString());

        System.out.println();
        Person personOne = new Person("pers1", 20);
        Person personTwo = new Person("pers1", 20);

        System.out.println(personOne.equals(personTwo));
        System.out.println(personOne == personTwo);



    }
}
