package Task2;

public class Main {

    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(12, 12, 12);
        triangle1.calculateSquare();

        Triangle triangle2 = new Triangle(-24, -20, -19);
        triangle2.calculateSquare();

        Triangle triangle3 = new Triangle(0,1,0);
        triangle3.calculateSquare();
    }
}
