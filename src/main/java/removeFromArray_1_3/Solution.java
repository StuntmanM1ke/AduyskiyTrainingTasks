package removeFromArray_1_3;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 2, 5, 2, 2, 2, 5, 2, 6, 8, 2, 4, 2};
        int a = 2;
        System.out.println(Arrays.toString(removeElements(arr, a)));


    }
    public static int[] removeElements (int[] array, int elementToRemove){
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != elementToRemove){
                array[index++] = array[i];
            }
        }
        return Arrays.copyOf(array, index);
    }
}

