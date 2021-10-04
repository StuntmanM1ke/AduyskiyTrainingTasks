package binarySearch_3_0;

public class Solution {
    public static void main(String[] args) {
        double[] array = new double[100000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        System.out.println(isElementExist(0.2, array));
    }
    public static int isElementExist (double element, double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element){
                return i;
            }
        }
        return -1;
    }
}
