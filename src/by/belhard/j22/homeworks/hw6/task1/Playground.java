package by.belhard.j22.homeworks.hw6.task1;

public class Playground {

    public static void main(String[] args) {

        Master master1 = new Master("Vasily");
        Master master2 = new Master("Olga");

        master1.setPet(new Cat("Barsik"));
        master2.setPet(new Dog("Bobik"));

        Pet homelessPet = new Fish("noname");

        master1.playWithOwnPet();
        master2.playWithOwnPet();

        master1.playWithAnyPet(master2.getPet());
        master2.playWithAnyPet(homelessPet);

    }

}
