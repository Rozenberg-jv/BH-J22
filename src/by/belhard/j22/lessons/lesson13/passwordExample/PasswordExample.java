package by.belhard.j22.lessons.lesson13.passwordExample;

public class PasswordExample {

    public static void main(String[] args) {

        PasswordStorage storage = new PasswordStorage();

        storage.addNewUser("Maxim", "abcde");

        System.out.println(storage.isPasswordValid("Maxim", "qwe"));
        System.out.println(storage.isPasswordValid("Maxim", "abcde"));
    }
}
