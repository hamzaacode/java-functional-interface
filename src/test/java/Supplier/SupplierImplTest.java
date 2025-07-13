package Supplier;

import model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Supplier;

class SupplierImplTest {
    SupplierImpl supplierImpl;
    //TDD follows
    //red
    //green
    //refactor
    @BeforeEach
    public void setup(){
         supplierImpl = new SupplierImpl();
    }
@Test
    public void supplierShouldNotBeNull(){
        Assertions.assertNotNull(supplierImpl);
    }
    @Test
    public void supplierResultShouldNotBeNull(){
        Assertions.assertNotNull(supplierImpl.getStringFromSupplier());
    }
    @Test
    public void supplierShouldNotBeEmpty(){
       String str= supplierImpl.getStringFromSupplier().get();
        Assertions.assertFalse(str.isEmpty());
    }
    @Test
    public void supplierMustReturnString(){
        Object str= supplierImpl.getStringFromSupplier().get();
        Assertions.assertInstanceOf(String.class, str);
    }

    // NumberSupplier
    @Test
    public void supplierMustBeReturnNumber(){
       Supplier<Number> supplier=supplierImpl.getNumberFromSupplier();
       Object object= supplier.get();
       Assertions.assertNotNull(supplier);
       Assertions.assertNotNull(object);
       Assertions.assertTrue(object instanceof Number);
    }

    @Test
    public void supplierMustReturnObject(){
        Supplier<User> supplier=supplierImpl.getUserSupplier();
        Object object= supplier.get();
        Assertions.assertNotNull(supplier);
        Assertions.assertNotNull(object);
        Assertions.assertTrue(object instanceof User);

    }
    @Test
    public void supplierShouldReturnUserList(){
        Supplier<List<User>> supplier=supplierImpl.getUserListSupplier();
        List<User> object= supplier.get();
        Assertions.assertNotNull(supplier);
        Assertions.assertInstanceOf(List.class, supplier.get());
        Assertions.assertFalse(object.isEmpty());
    }
    @Test
    public void supplierMustReturnUserList(){

        supplierImpl.getStreamFromSupplier().get();
    }
}