package Function;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class FunctionImplTest {
    FunctionImpl function;

    @BeforeEach
    void setup() {
        function = new FunctionImpl();
    }

    @Test
    void getLengthFunction() {
        Function<String, Integer> lengthFunction = function.getLengthFunction();
        Assertions.assertNotNull(lengthFunction);
        Assertions.assertEquals(lengthFunction.apply("apple"), 5);
    }

    @Test
    void sholdGetConverterFunction(){
        Function<Double,Double> converter=function.celsiusToFarenHeit();
        Assertions.assertNotNull(converter);
        Assertions.assertEquals(converter.apply(25.0), 77);
    }

    @Test
    void sholdGetUpperCaseConverterFunction(){
        Function<String,String> converter=function.convertNameIntoUpperCase();
        Assertions.assertNotNull(converter);
        Assertions.assertEquals(converter.apply("apple"),"APPLE");
    }
}