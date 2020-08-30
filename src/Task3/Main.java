package Task3;

public class Main {

    public static void main(String[] args) {
        Vector3d vec1 = new Vector3d(12, 14, -13);
        Vector3d vec2 = new Vector3d(37, -15, 0);
        Vector3d vec3 = new Vector3d(29, 14, -88);

        vec1.scalar(vec1, vec2);
        vec1.vector(vec1, vec2);
        vec2.vector(vec1, vec3);
        vec3.sumOfTwoVectors(vec1, vec2);
    }
}
