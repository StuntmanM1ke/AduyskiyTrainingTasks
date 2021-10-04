package generateRandomElementWIthWeight_2_1;

public class GenerateRandomElementWIthWeight {
    private int[] values;
    private int[] weights;
    private int[] ranges;
    private int sum;

    public GenerateRandomElementWIthWeight(int[] values, int[] weights) {
        this.values = values;
        this.weights = weights;
        ranges = new int[values.length];
        sum = 0;
        for (int weight: weights ){
            sum += weight;
        }
        int lastSum = 0;
        for (int i = 0; i < ranges.length; i++) {
            ranges[i] = lastSum;
            lastSum += weights[i];
        }
    }

    public int getRandom(){
        int random = (int) (Math.random() * (sum - 1));
        int index = 0;
        for (int i = 0; i < ranges.length; i++) {
            if (ranges[i] > random){
                break;
            }
            index = i;
        }
        return values[index];
    }
}
