package hierarchy_4_0;

public class Cylinder extends SolidOfRevolution{
    private double height;

    public Cylinder(double radius,double height) {
        super(Math.PI * radius * radius * height, radius);
        this.height = height;
    }
}
