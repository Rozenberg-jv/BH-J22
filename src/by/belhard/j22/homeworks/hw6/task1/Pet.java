package by.belhard.j22.homeworks.hw6.task1;

public abstract class Pet implements Nameable, Playable{

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
