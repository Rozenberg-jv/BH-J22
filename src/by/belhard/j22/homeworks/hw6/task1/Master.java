package by.belhard.j22.homeworks.hw6.task1;

public class Master implements Nameable {

    private Playable pet;

    private String name;

    public Master(String name) {
        this.name = name;
    }

    public void playWithOwnPet() {
        playWithAnyPet(this.pet);
    }

    public void playWithAnyPet(Playable pet) {
        System.out.print(name + " plays: ");
        pet.play();
    }

    public Playable getPet() {
        return pet;
    }

    public void setPet(Playable pet) {
        this.pet = pet;
    }

    @Override
    public String getName() {
        return name;
    }
}
