package Predicate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

class PredicateImplTest {
    PredicateImpl predicateImpl;

    @BeforeEach
    void setUp() {
        predicateImpl = new PredicateImpl();
    }

    @Test
    void getEvenPredicate() {
        Predicate<Integer> integerPredicate = predicateImpl.getEvenNumberPredicate();
        Assertions.assertNotNull(integerPredicate);
        Assertions.assertTrue(integerPredicate.test(Integer.valueOf(10)));
    }

    @Test
    void getOddPredicate() {
        Predicate<Integer> integerPredicate = predicateImpl.getOddNumberPredicate();
        Assertions.assertNotNull(integerPredicate);
        Assertions.assertTrue(integerPredicate.test(Integer.valueOf(11)));
    }

    @Test
    void getPrimeNumberPredicate() {
       Predicate<Integer> primePredicate= predicateImpl.getPrimeNumberPredicate();
       Assertions.assertNotNull(primePredicate);
       Assertions.assertTrue(primePredicate.test(Integer.valueOf(2)));
    }
}