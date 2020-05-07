package by.belhard.j22.lessons.lesson06.abstractExample;

public class Manager extends Person implements PhoneCallable, Punishable {

    private static final int SUFFERING_COEFFICIENT = 5;

    private int phoneNumber;

    public Manager(String name, int age, int phoneNumber) {
        super(name, age);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void work() {
        System.out.println(getName() + " works not hard");
    }

    @Override
    public void phoneCall(int phoneNumber) {
        System.out.println(getName()+ " is calling " + phoneNumber);
    }

    @Override
    public int punish(int levelOfPunish) {

        System.out.println(getName() + " suffers by " + (levelOfPunish * SUFFERING_COEFFICIENT));

        return levelOfPunish * SUFFERING_COEFFICIENT;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Manager{" + super.toString() +
                " phoneNumber=" + phoneNumber +
                '}';
    }
}
