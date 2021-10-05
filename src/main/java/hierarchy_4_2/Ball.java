package hierarchy_4_2;

public class Ball implements Shape, SolidOfRevolution {
    protected double radius;

    public Ball(double radius) {
        this.radius = radius;
    }


    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 3) * 4 / 3;
    }
}
