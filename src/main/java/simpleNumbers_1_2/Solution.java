package simpleNumbers_1_2;

public class Solution {
    public static void main(String[] args) {
        for (int i = 2; i < 101; i++) {
            if (isNumberSimple(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isNumberSimple(int number) {
        if (number == 2 || number == 3 || number == 5 || number == 7) {
            return true;
        }
        return number % 2 != 0 && number % 3 != 0 && number % 5 != 0 && number % 7 != 0;
    }
}
