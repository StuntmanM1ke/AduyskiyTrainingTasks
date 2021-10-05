package hierarchy_4_2;

public class Cylinder implements Shape, SolidOfRevolution {
    private  double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public double getRadius() {
        return radius;
    }
}
