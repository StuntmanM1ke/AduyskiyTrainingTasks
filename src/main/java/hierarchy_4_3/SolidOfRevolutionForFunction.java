package hierarchy_4_3;

import java.util.function.Function;

public class SolidOfRevolutionForFunction extends SolidOfRevolution {
    private Function<Double, Double> function;
    private double a;
    private double b;

    public SolidOfRevolutionForFunction(Function<Double, Double> function, double a, double b) {
        super(b - a);
        this.function = function;
        this.a = a;
        this.b = b;
    }

    @Override
    public double getVolume() {
        double sum = 0;
        int integrations = 10000;
        double delta = (b - a) / integrations;
        for (int i = 0; i < integrations; i++) {
            double x = a + ((b - a) * i / integrations);
            sum += Math.pow(function.apply(x), 2) * delta;
        }
        return Math.PI * sum;
    }
}
