package temperatureConverter_6_0;

public class Solution {
    public static void main(String[] args) {
        double tC = 19.5;
        System.out.println(new CelsiusConverter().getConvertedValue(tC));
        System.out.println(new FarenheitConverter().getConvertedValue(tC));
        System.out.println(new CelvinConverter().getConvertedValue(tC));
    }
}
