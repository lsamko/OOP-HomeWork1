package Task1;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat(5, "Lily", "chocolate", "Persian cat", 4.5);
        Cat cat2 = new Cat(3, "Max", "grey", "British Shorthair", 7);
        Cat cat3 = new Cat(1, "Nicki", "white", "Siamese cat", 4.5);

        cat1.checkCatsHappiness(7);
        System.out.println();
        cat2.checkCatsHappiness(4);
        System.out.println();
        cat3.checkCatsHappiness(15);
    }
}
