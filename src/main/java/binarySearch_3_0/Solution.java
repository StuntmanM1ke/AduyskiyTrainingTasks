package binarySearch_3_0;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        double[] array = new double[100000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        long time = System.currentTimeMillis();
        isElementExist(0.2, array);
        System.out.println(System.currentTimeMillis() - time);
        time = System.currentTimeMillis();
        binarySearch(0.2,array);
        System.out.println(System.currentTimeMillis() - time);
    }

    public static int isElementExist (double element, double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch (double element, double[] arr){
        return binarySearchRecursively(arr,element,0,arr.length);
    }

    private static int binarySearchRecursively (double[] sortedArray, double element, int low, int high) {
        int middle = (low + high) / 2;

        if (high < low) {
            return -1;
        }

        if (element == sortedArray[middle]) {
            return middle;
        } else if (element < sortedArray[middle]) {
            return binarySearchRecursively(
                    sortedArray, element, low, middle - 1);
        } else {
            return binarySearchRecursively(
                    sortedArray, element, middle + 1, high);
        }
    }
}
