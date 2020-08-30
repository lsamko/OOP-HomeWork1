package Task1;

public class Cat {

    private int age;
    private String name;
    private String color;
    private String breed;
    private double weight;

    public Cat(int age, String name, String color, String breed, double weight) {
        this.age = age;
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.weight = weight;
    }

    public Cat() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void checkCatsHappiness(int happiness) {
        if (happiness >= 10) {
            System.out.println("Purrrr..");
            sleep();
        } else if (happiness < 10 && happiness >= 5) {
            System.out.println("Meeeeow...");
            playWithCat();
        } else {
            System.out.println("Rrrrrr!");
            feedTheCat();
        }
    }

    public void playWithCat() {
        System.out.println("Let's play!");
    }

    public void feedTheCat() {
        System.out.println("Here is your food, kitty");
    }

    public void sleep() {
        System.out.println("Cat is happy and goes to sleep.. Zzzzzz");
    }

    @Override
    public String toString() {
        return "Cat{" +
            "age=" + age +
            ", name='" + name + '\'' +
            ", color='" + color + '\'' +
            ", breed='" + breed + '\'' +
            ", weight=" + weight +
            '}';
    }
}
