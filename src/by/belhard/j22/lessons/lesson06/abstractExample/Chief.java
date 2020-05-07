package by.belhard.j22.lessons.lesson06.abstractExample;

public class Chief extends Person implements PhoneCallable{

    public Chief(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println(getName() + " works... He is boss! Others work");
    }

    @Override
    public int punish(int levelOfPunish) {
        System.out.println("Boss can not suffer!");
        return 0;
    }

    @Override
    public void phoneCall(int phoneNumber) {
        System.out.println(getName() + " calling " + phoneNumber + " like a boss");
    }
}
