package by.belhard.j22.homeworks.hw6.task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    private static final int STRING_LENGTH_BORDER = 3;

    public static void main(String[] args) {

        List<String> strings =
                Arrays.asList("  ","aaa","","bd31",".","dfqef","d13f","bbb","fa3f32f");

        /*StringBuilder sb = new StringBuilder();

        for (String string : strings) {
            if (string.length() <= STRING_LENGTH_BORDER)
                sb.append(string).append(" ");
        }

        String result = sb.length() > 1 ?
                sb.deleteCharAt(sb.length() - 1).toString() :
                sb.toString();

        System.out.println(result);*/

        System.out.println(strings.stream()
                .filter(s -> s.length() <= STRING_LENGTH_BORDER)
                .collect(Collectors.joining(" ")));
    }
}
