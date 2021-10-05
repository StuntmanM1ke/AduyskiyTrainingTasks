package hierarchy_4_1;

public class Pyramid extends Shape {
    private double s;
    private double height;

    public Pyramid(double height, double s) {
        this.s = s;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return height * s * 4 / 3;
    }
}
