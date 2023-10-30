package Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerBasicExample {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Define a Consumer to print the names
        Consumer<String> printName = name -> System.out.println("Name: " + name);

        // Apply the Consumer to each name in the list
       // processNames(names, printName);

        names.forEach(printName);
    }

    // Method to process a list of names using a Consumer
    public static void processNames(List<String> names, Consumer<String> consumer) {
        for (String name : names) {
            consumer.accept(name);
        }
    }
}
