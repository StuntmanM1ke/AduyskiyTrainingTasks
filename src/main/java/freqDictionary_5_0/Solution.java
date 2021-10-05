package freqDictionary_5_0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Map<Character, Integer> dictionary = new HashMap<>();
        String text = "Частотность — термин лексикостатистики, предназначенный для определения наиболее употребительных слов.";
        char [] textInArray = text.toLowerCase().toCharArray();
        for (char c : textInArray) {
            dictionary.put(c, howManyThisLetters(textInArray, c));
        }

        ArrayList<Map.Entry<Character, Integer>> entries =
                new ArrayList<>(dictionary.entrySet());
        entries.sort((o1, o2) -> Character.compare(o1.getKey(), o2.getKey()));
        for(Map.Entry<Character, Integer> entry : entries){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }

    public static int howManyThisLetters (char[] text, char letter){
        int counter = 0;
        for (char c : text) {
            if (c == letter) {
                counter++;
            }
        }
        return counter;
    }


}
