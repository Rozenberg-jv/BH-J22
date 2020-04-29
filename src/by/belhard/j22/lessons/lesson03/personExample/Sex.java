package by.belhard.j22.lessons.lesson03.personExample;

public enum Sex {

    MALE(5), FEMALE(2), NA(0);

    private int code;

    Sex(int a) {
        this.code = a;
    }

    public int getCode() {
        return code;
    }
}
