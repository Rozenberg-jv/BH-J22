package by.belhard.j22.lessons.lesson13.passwordExample;

import java.util.HashMap;
import java.util.Map;

public class PasswordStorage {

    private final Map<String, String> map = new HashMap<>();

    public void addNewUser(String username, String password) {
        map.put(username, hash(password));
    }

    private String hash(String rawPassword) {

        return Integer.toHexString(rawPassword.hashCode() * 31);
    }

    public boolean isPasswordValid(String username, String rawPassword) {

        String s = map.get(username);

        if (s == null)
            throw new NoSuchUserException(username);

        return hash(rawPassword).equals(s);
    }
}
