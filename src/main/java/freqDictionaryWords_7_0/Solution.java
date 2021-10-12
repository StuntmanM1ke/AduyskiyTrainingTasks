package freqDictionaryWords_7_0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String text = "Все эти проблемы связаны с тем, что со статистической точки зрения язык представляет собой большое количество редких событий (Закон Ципфа), в результате чего небольшое количество слов встречается очень часто, а подавляющее большинство слов имеют очень невысокую частоту. Частота слова и (самого частотного слова русского языка) примерно в 10 раз выше частоты слова о, которое в свою очередь встречается в 100 раз чаще таких обыденных слов как путешествие, старость или мода.";
        ArrayList<Map.Entry<String, Integer>> entries =
                new ArrayList<>(getDictionary(text).entrySet());
        entries.sort((o1, o2) -> CharSequence.compare(o1.getKey(), o2.getKey()));
        for(Map.Entry<String, Integer> entry : entries){
            if (!entry.getKey().equals(""))
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }

    public static Map<String, Integer>  getDictionary (String string){
        Map<String, Integer> dictionary = new HashMap<>();
        String[] arr = string.split("[^a-zA-ZА-Яа-я]");
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if(dictionary.get(arr[i])== null){
                dictionary.put(arr[i], 1);
            } else {
                temp = dictionary.get(arr[i]);
                temp++;
                dictionary.put(arr[i], temp);
            }
        }
        return dictionary;
    }
}
