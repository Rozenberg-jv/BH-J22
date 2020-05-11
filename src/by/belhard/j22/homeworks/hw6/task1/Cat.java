package by.belhard.j22.homeworks.hw6.task1;

public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(getName() + " meow-meow");
    }
}
