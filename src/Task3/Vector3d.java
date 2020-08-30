package Task3;

public class Vector3d {

    private int x;
    private int y;
    private int z;

    public Vector3d(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3d() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void sumOfTwoVectors(Vector3d a, Vector3d b) {
        Vector3d sum = new Vector3d((a.x + b.x), (a.y + b.y), (a.z + b.z));
        System.out.println("Sum of two vectors equals: " + sum);
    }

    public void scalar(Vector3d a, Vector3d b) {
        float scalar = a.x * b.x + a.y * b.y + a.z * b.z;
        System.out.println("Scalar product of vectors is: " + scalar);
    }

    public void vector(Vector3d a, Vector3d b) {
        Vector3d vector = new Vector3d((a.y * b.z - a.z * b.y), (a.z * b.x - a.x * b.z), (a.x * b.y - a.y * b.x));
        System.out.println("Vector product of vectors is: " + vector);
    }

    @Override
    public String toString() {
        return "Vector3d{" +
            "x=" + x +
            ", y=" + y +
            ", z=" + z +
            '}';
    }

}