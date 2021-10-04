package max_min_avg_and_bubbleSort_1_0_1;

public class Solution {
    public static void main(String[] args) {
        double minNumber;
       double maxNumber;
        double avg;
        double summ = 0;
        Double[] arr = new Double[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
        }
        bubbleSort(arr);
        for (Double aDouble : arr) {
            summ = summ + aDouble;
        }
        minNumber = arr[0];
        maxNumber = arr[arr.length-1];
        avg = summ/arr.length;
        System.out.println("Min = " + minNumber + "Max = " + maxNumber + "AVG = " + avg);

    }

    public static void bubbleSort(Double[] array) {
        boolean sorted = false;
        Double temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }
}
