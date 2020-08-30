package Task2;

public class Triangle {

    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle() {
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public float calculateSquare() {
        float s = 0;
        float p = (side1 + side2 + side3) >> 1;
        if (p == 0) {
            System.out.println("The sides of a triangle cannot be equal zero");
        } else if (p < 0) {
            System.out.println("The sides of a triangle cannot be less than zero");
        } else {
            s = (float) Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
            System.out.println("Square of the triangle is: " + s);
        }
        return s;
    }

    @Override
    public String toString() {
        return "Triangle{" +
            "side1=" + side1 +
            ", side2=" + side2 +
            ", side3=" + side3 +
            '}';
    }
}
