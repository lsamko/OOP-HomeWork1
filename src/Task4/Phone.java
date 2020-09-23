package Task4;

import java.util.List;
import java.util.Objects;

public class Phone extends Network {

    private String number;
    private Network network;

    public Phone(String name, List<Phone> numbers, int networkId, String number, Network network) {
        super(name, numbers, networkId);
        this.number = number;
        this.network = network;
    }

    public Phone(String number, Network network) {
        this.number = number;
        this.network = network;
    }

    public Phone() {
        super();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public void registerNumber(){
        network.registerNumber(this);
    }

    public void call(String outgoingNumber){
       boolean isCalling = network.call(number, outgoingNumber);
       if(isCalling){
           System.out.println("Calling ..");
       } else {
           System.out.println("This number doesn't exist: " + outgoingNumber);
       }
    }

    public void receiveCall(String outgoingNumber){
        System.out.println("Ring-ring! " + outgoingNumber);
    }

    @Override
    public String toString() {
        return "Phone{" +
            "number='" + number + '\'' +
            ", network=" + network +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Phone)) {
            return false;
        }
        Phone phone = (Phone) o;
        return Objects.equals(getNumber(), phone.getNumber()) &&
            Objects.equals(getNetwork(), phone.getNetwork());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber(), getNetwork());
    }
}
