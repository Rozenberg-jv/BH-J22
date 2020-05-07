package by.belhard.j22.lessons.lesson06.abstractExample;

public class Worker extends Person implements Punishable{

    private static final int SUFFERING_COEFFICIENT = 2;

    private String factoryName;

    public Worker(String name, int age, String factoryName) {
        super(name, age);
        this.factoryName = factoryName;
    }

    @Override
    public void work() {
        System.out.println(getName() + " works hard");
    }

    public String getFactoryName() {
        return factoryName;
    }

    @Override
    public int punish(int level) {
        System.out.println(getName() + " suffers by " + (level * SUFFERING_COEFFICIENT));
        return level * SUFFERING_COEFFICIENT;
    }

    @Override
    public String toString() {
        return "Worker{" + super.toString() +
                " factoryName='" + factoryName + '\'' +
                '}';
    }
}
