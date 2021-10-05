package hierarchy_4_3;


import java.util.function.Function;

public class Solution {
    public static void main(String[] args) {
        Shape shape = new SolidOfRevolutionForFunction(new Function<Double, Double>()  {
            @Override
            public Double apply(Double x) {
                return Math.cos(x);
            }
        }, 0, 10);
        System.out.println(shape.getVolume());
    }
}
