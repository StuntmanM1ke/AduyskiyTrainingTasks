package generateRandomElementWIthWeight_2_1;

public class Solution {
    public static void main(String[] args) {
        GenerateRandomElementWIthWeight generateRandomElementWIthWeight = new GenerateRandomElementWIthWeight(new int[]{1, 2, 3},new int[]{1,2,10});
        for (int i = 0; i < 30; i++) {
            System.out.println(generateRandomElementWIthWeight.getRandom());
        }
    }
}
