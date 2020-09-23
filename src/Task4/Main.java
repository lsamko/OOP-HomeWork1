package Task4;


public class Main {

    public static void main(String[] args) {
        Network network = new Network();

        String number1 = "380664351234";
        String number2 = "380505567120";
        String number3 = "380964567891";

        Phone phone1 = new Phone(number1, network);
        Phone phone2 = new Phone(number2, network);

        phone1.registerNumber();
        phone2.registerNumber();

        phone2.call(number1);
        System.out.println();
        phone1.call(number3);
    }
}


