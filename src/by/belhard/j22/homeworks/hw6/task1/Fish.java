package by.belhard.j22.homeworks.hw6.task1;

public class Fish extends Pet {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println(getName() + " keep silence");
    }
}
