package array_iterator_7_4;


public class Solution {
    public static void main(String[] args) {
        Integer[][] arr = new Integer[8][8];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = j + 1;
            }
        }
        ArrayIterator2d it = new ArrayIterator2d(arr);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
