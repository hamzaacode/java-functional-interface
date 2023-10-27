package Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class TemperatureConversion {
    public static void main(String[] args) {
        // Create a list of temperatures in Celsius
        List<Double> celsiusTemperatures = new ArrayList<>();
        celsiusTemperatures.add(0.0);
        celsiusTemperatures.add(25.0);
        celsiusTemperatures.add(100.0);

        // Define a Function to convert Celsius to Fahrenheit
        Function<Double, Double> celsiusToFahrenheit = celsius -> (celsius * 9/5) + 32;

        // Use the map method with the Function to convert temperatures
        List<Double> fahrenheitTemperatures = mapList(celsiusTemperatures, celsiusToFahrenheit);

        // Print the converted temperatures
        for (int i = 0; i < celsiusTemperatures.size(); i++) {
            System.out.println(celsiusTemperatures.get(i) + "°C is " + fahrenheitTemperatures.get(i) + "°F");
        }
    }

    // Method to map a list using a Function
    public static List<Double> mapList(List<Double> list, Function<Double, Double> function) {
        List<Double> transformedList = new ArrayList<>();
        for (Double item : list) {
            transformedList.add(function.apply(item));
        }
        return transformedList;
    }
}
