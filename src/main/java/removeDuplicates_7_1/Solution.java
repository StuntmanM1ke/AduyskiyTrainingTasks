package removeDuplicates_7_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add("№" + i);
            list.add("№" + i);
        }
        Collection<String> cleared = removeDuplicates(list);
        for (String s : cleared) {
            System.out.print(s + " ");
        }
    }

    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }
}

