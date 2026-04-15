import java.util.*;

class InvalidCapacityException extends Exception {
    InvalidCapacityException(String message) {
        super(message);
    }
}

class PassengerBogie {
    String type;
    int capacity;

    PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }
}

public class TrainConsistUC14 {

    public static void main(String[] args) {

        try {

            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            PassengerBogie b2 = new PassengerBogie("AC Chair", 60);
            PassengerBogie b3 = new PassengerBogie("First Class", -10);

            System.out.println("Bogies Created Successfully");

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program Continues...");
    }
}