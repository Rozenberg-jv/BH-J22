package by.belhard.j22.lessons.lesson05.inheritanceExample;

public class Manager extends Person{

    private int phoneNumber;

    public Manager(String name, int age, int phoneNumber) {
        super(name, age);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void work() {
        System.out.println(getName() + " works not hard");
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
