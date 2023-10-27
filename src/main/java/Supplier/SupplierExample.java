package Supplier;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        // Define a Supplier to generate a random number
        Supplier<Integer> randomSupplier = () -> new Random().nextInt(100);

        // Get a random number using the Supplier
        int randomNumber = randomSupplier.get();

        System.out.println("Random Number: " + randomNumber);
    }
}
