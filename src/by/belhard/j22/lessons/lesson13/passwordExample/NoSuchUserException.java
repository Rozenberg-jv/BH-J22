package by.belhard.j22.lessons.lesson13.passwordExample;

public class NoSuchUserException extends RuntimeException {
    public NoSuchUserException(String username) {
        super("No username: " + username);
    }
}
