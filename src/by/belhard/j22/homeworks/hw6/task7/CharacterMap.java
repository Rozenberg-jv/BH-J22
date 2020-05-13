package by.belhard.j22.homeworks.hw6.task7;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CharacterMap {

    private static final char PUNCTUATION_MARK_PLACEHOLDER = '*';

    private static final String PUNCTUATION_MARKS = ",.!?()-_=/*+'\\\"";

    public static void main(String[] args) {

        String inputString = "Mama, myla ramu!11oneone.";

        Map<Character, Integer> characterMap = getCharacterMap(inputString);

        characterMap.forEach((k, v) -> System.out.printf("%2s : %3d\n", k, v));
        System.out.println();
        characterMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.printf("%2s : %3d\n", e.getKey(), e.getValue()));
        System.out.println();
    }

    private static Map<Character, Integer> getCharacterMap(String inputString) {

        Map<Character, Integer> map = new TreeMap<>(Character::compareTo);

        inputString = inputString.toLowerCase();

        for (char c : inputString.toCharArray()) {

            if (PUNCTUATION_MARKS.contains(c + "")) {
                c = PUNCTUATION_MARK_PLACEHOLDER;
            }

            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        return map;
    }
}
