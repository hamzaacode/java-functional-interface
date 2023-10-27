package Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        // Create a list of Integer
        List numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        // Define a Function to convert a Integer to String
        Function<Integer, String> getInt = intData -> intData*2+" data multiplied by 2";

        // Use the map method with the Function to transform the integer to string
        List<String> getString = mapList(numbers, getInt);

        // Print the transformed list
        System.out.println("Transformed numbers: " + getString);
    }

    // Method to transform a list using a Function
    public static List<String> mapList(List<Integer> numbers, Function<Integer, String> function) {
        List<String> transformedList = new ArrayList<>();
        for (Integer number : numbers) {
            transformedList.add(function.apply(number));
        }
        return transformedList;
    }
}
