package fill_6_4;

import java.util.function.Function;

public class Solution {
    public static void main(String[] args) {
            Integer[] squares = new Integer[100];
            fill(squares, integer -> integer * integer);
            for (Integer square: squares){
                System.out.print(square + " ");
            }
    }

    public static <T> void fill(T[] objects, Function<Integer, ? extends T> function){
        for (int i = 0; i < objects.length; i++) {
            objects[i] = function.apply(i);
        }
    }


}
