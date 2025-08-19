package Supplier;

import model.User;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;


public class SupplierImpl {
//    @FunctionalInterface
//    public interface Supplier<T> (){
//        T get();
//    }

    public Supplier<String> getStringFromSupplier(){
        Supplier<String> stringSupplier = () -> "Hello, Java Supplier!";
        return stringSupplier;
    }

    public Supplier<String> getStringSupplier(){
        String str="hello,world";
        Supplier<String> stringSupplier = () -> "hello world";
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

    public Supplier<Stream<String>> getStreamFromSupplier() {

        List<String> data = Arrays.asList("apple", "banana", "cherry");

        // Supplier creates a fresh stream each time
        Supplier<Stream<String>> streamSupplier = () -> data.stream().filter(s -> s.length() > 5);

        // Try 1
        System.out.println("First Try:");
        streamSupplier.get().forEach(System.out::println);

        // Try 2 (reuse stream logic)
        System.out.println("Second Try:");
        streamSupplier.get().forEach(System.out::println);

        return streamSupplier;
    }

    public Supplier<Stream<String>>  getStreamFromSupplier2() {
        List<String> fruits=Arrays.asList("Apple","Banana","Cherry");
       Supplier<Stream<String>> streamSupplier=()->fruits.stream().filter(s->s.startsWith("A"));
       Supplier<Stream<String>> streamSupplierForSize=()->fruits.stream().filter(s->s.length()>3);
        return streamSupplier;
    }
}
