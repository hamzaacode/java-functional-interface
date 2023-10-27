package Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        // Define a Predicate to filter even numbers
        Predicate<Integer> isEven = number -> number % 2 == 0;

        // Filter the list using the Predicate
        List<Integer> evenNumbers = filterList(numbers, isEven);

        // Print the filtered list
        System.out.println("Even numbers: " + evenNumbers);
    }

    // Method to filter a list using a Predicate
    public static List<Integer> filterList(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> filteredList = new ArrayList<>();
        for (Integer item : list) {
            if (predicate.test(item)) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }
}
