package Task4;

import java.util.ArrayList;
import java.util.List;

public class Network {

    private String name;
    List<Phone> numbers = new ArrayList<>();
    private int networkId;

    public Network(String name, List<Phone> numbers, int networkId) {
        this.name = name;
        this.numbers = numbers;
        this.networkId = networkId;
    }

    public Network() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Phone> numbers) {
        this.numbers = numbers;
    }

    public int getNetworkId() {
        return networkId;
    }

    public void setNetworkId(int networkId) {
        this.networkId = networkId;
    }

    public void registerNumber(Phone phone) {
        numbers.add(phone);
    }

    public boolean call(String incomingNumber, String outgoingNumber) {
        Phone phone = findPhone(outgoingNumber);
        if (phone != null) {
            phone.receiveCall(incomingNumber);
            return true;
        } else {
            return false;
        }
    }

    public Phone findPhone(String number) {
        for (Phone num : numbers) {
            Phone thisPhone = num;
            if (thisPhone.getNumber().equals(number)) {
                return thisPhone;
            }
        }
        return null;
    }
}


