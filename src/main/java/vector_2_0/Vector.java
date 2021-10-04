package vector_2_0;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double vectorLength() {
        return Math.sqrt((x * x) + (y * y) + (z * z));
    }

    public double scalarProduct(Vector vector) {
        return (x * vector.x) + (y * vector.y) + (z * vector.z);
    }

    public Vector crossProduct(Vector vector) {
        return new Vector(
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);
    }

    public double cosinus(Vector vector) {
        return scalarProduct(vector) / vectorLength() * vector.vectorLength();
    }

    public Vector sum(Vector vector) {
        return new Vector(
                x + vector.x,
                y + vector.y,
                z + vector.z);
    }

    public Vector diff(Vector vector) {
        return new Vector(
                x - vector.x,
                y - vector.y,
                z - vector.z);
    }

    public static Vector[] vectorsArrayGenerate(int n){
        Vector[] arr = new Vector[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return arr;
    }

}
