package countElements_7_7;


import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

    }
    <K> Map<K, Integer> arrayToMap(K[] ks){
        Map<K, Integer> map = new HashMap<>();
        Integer temp;
        for (int i = 0; i < ks.length; i++) {
            if(map.get(ks[i])== null){
                map.put(ks[i], 1);
            } else {
                temp = map.get(ks[i]);
                temp++;
                map.put(ks[i], temp);
            }
        }
        return map;
    }
}
