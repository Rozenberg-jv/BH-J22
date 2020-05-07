package by.belhard.j22.lessons.lesson06.collections;

import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o, Integer t1) {
        return t1 - o;
    }
}
