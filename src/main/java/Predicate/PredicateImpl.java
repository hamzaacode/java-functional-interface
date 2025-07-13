package Predicate;

import model.User;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateImpl {

//    @FunctionalInterface
//    public interface Predicate<T> (){
//        boolean test(T t);
//    }

    public Predicate<Integer> getEvenNumberPredicate() {
        return num -> num % 2 == 0;
    }

    public Predicate<Integer> getOddNumberPredicate() {
        Predicate<Integer> oddPredicate = num -> {
            boolean result = num % 2 != 0;
            return result;
        };
        return oddPredicate;
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

//    public Predicate<Integer> getPrimeNumberPredicate() {
//        Predicate<Integer> primePredicate = num -> {
//            if (num <= 1) return false; // 0, 1, negative => not prime
//            for (int i = 2; i < num; i++) {
//                if (num % i == 0) {
//                    return false; // found a divisor
//                }
//            }
//            return true; // no divisors found, it's prime
//        };
//        return primePredicate;
//    }

    public Predicate<User> getAdultPredicate() {
        List<User> users = Arrays.asList(
                new User("Alice", 30),
                new User("Bob", 15),
                new User("Charlie", 22)
        );
        Predicate<User> isAdult = user -> user.age >= 18;
        return isAdult;
    }
}





