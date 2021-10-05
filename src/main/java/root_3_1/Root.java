package root_3_1;

public class Root {

    public static void main(String[] args) {
        System.out.println(solve(0,10));
    }

    public static double func(double x) {
        return Math.cos(Math.pow(x, 5)) + Math.cos(Math.pow(x, 4)) - 345.3 * x - 23;
    }

    public static double solve(double start, double end) {
        if (end - start <= 0.001) {
            return start;
        }
        double x = start + (end - start) / 2;

        if(func(start) * func(x) > 0){
            return solve(x, end);
        } else {
            return solve(start, x);
        }
    }
}
