package Supplier;

import model.User;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Supplier;

public class RealWorldSuppliers {

    // 1. Primitive Value Suppliers
    public Supplier<Integer> defaultRetryCount = () -> (Integer) 3;
    public Supplier<Double> randomDouble = () -> (Double) Math.random();
    public Supplier<Boolean> isFeatureEnabled = () -> (Boolean) true;

    // 2. String & Text Suppliers
    public Supplier<String> greetingMessage = () -> "Welcome to the app!";
    public Supplier<String> currentDateString = () -> LocalDate.now().toString();
    public Supplier<String> randomUsername = () -> "User_" + UUID.randomUUID();

    // 3. Object/Data Model Supplier
    public Supplier<User> defaultUser = () -> new User("Alice", 30);

    // 4. Collection Suppliers
    public Supplier<List<String>> fruitsList = () -> Arrays.asList("Apple", "Banana", "Orange");
    public Supplier<Map<String, Integer>> defaultScoreMap = () -> {
        Map<String, Integer> map = new HashMap<>();
        map.put("Math", Integer.valueOf(95));
        map.put("Science", Integer.valueOf(88));
        return map;
    };

    // 5. I/O Supplier (lazy resource loading)
    public Supplier<InputStream> configFileStream = () -> {
        try {
            return new FileInputStream("config.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    };

    // 6. Optional & Conditional Supplier
    public Supplier<Optional<String>> maybeEmail = () -> Optional.ofNullable(fetchEmail());

    // Simulated DB connection supplier (mock)
    public Supplier<Connection> dbConnectionSupplier = () -> {
        throw new UnsupportedOperationException("Simulated DB supplier");
    };

    // Method used by maybeEmail
    private String fetchEmail() {
        return Math.random() > 0.5 ? "user@example.com" : null;
    }

    // Sample data model class

}