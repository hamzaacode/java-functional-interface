import model.User;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    //    @FunctionalInterface
//    public interface Supplier<T> (){
//        T get();
//    }

    public Supplier<String> getStringFromSupplier(){
        Supplier<String> stringSupplier = () -> "Hello, Java Supplier!";
        return stringSupplier;
    }

    public Supplier<Number> getNumberFromSupplier() {
        return () -> (Number) 8787;
    }

    public Supplier<User> getUserSupplier() {
        Supplier<User> userSupplier = () -> new User("Amir",36);
        return userSupplier;
    }

    public Supplier<List<User>> getUserListSupplier() {
        Supplier<List<User>> userListSupplier = () -> Arrays.asList(new User("Amir",35));
        return userListSupplier;
    }

// Predicate

    //    @FunctionalInterface
//    public interface Predicate<T> (){
//        boolean test(T t);
//    }


    public Predicate<Integer> getEvenNumberPredicate() {
        return num -> num % 2 == 0;
    }

    public Predicate<Integer> getPrimeNumberPredicate() {
        Predicate<Integer> primePredicate = num -> {
            if (num <= 1) return false;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) return false;
            }
            return true;
        };
        return primePredicate;
    }
    public Predicate<User> getAdultPredicate() {
        List<User> users = Arrays.asList(
                new User("Alice", 30),
                new User("Bob", 15),
                new User("Charlie", 22)
        );
        Predicate<User> isAdult = user -> user.age >= 18;
        return isAdult;
    }

    // Function

    //    @FunctionalInterface
//    public interface Function<T,R>{
//       R apply(T t);
//    }

    public Function<String, Integer> getLengthFunction() {
        Function<String,Integer> function= s->s.length();
        return function;
    }

    public Function<String, String> convertNameIntoUpperCase() {
        Function<String, String> function = s -> s.toUpperCase();
        return function;
    }

    public Function<Double, Double> celsiusToFarenHeit() {
        Function<Double,Double> function = c -> (c * 9/5) + 32;
        return function;
    }

    // Consumer

    //    @FunctionalInterface
//    public interface Consumer<T> {
//        void accept(T t);
//    }
    public Consumer<String> printUppterCase() {
        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
        printUpperCase.accept("hello world"); // Output: HELLO WORLD
        return printUpperCase;
    }

    public static void main(String[] args) {
        // 1. Supplier - Provides a list of names
        Supplier<List<String>> nameSupplier = () -> Arrays.asList("Alice", "Bob", "Charlie", "Anna", "David");

        // 2. Predicate - Filters names starting with 'A'
        Predicate<String> startsWithA = name -> name.startsWith("A");

        // 3. Function - Converts name to uppercase
        Function<String, String> toUpperCase = String::toUpperCase;

        // 4. Consumer - Prints the final name
        Consumer<String> printName = name -> System.out.println("Name: " + name);

        // Using all in Stream API
        nameSupplier.get().stream()
                .filter(startsWithA)      // Predicate
                .map(toUpperCase)         // Function
                .forEach(printName);      // Consumer
    }

}



