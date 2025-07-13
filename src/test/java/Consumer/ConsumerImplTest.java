package Consumer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.*;

class ConsumerImplTest {
    ConsumerImpl consumer;
    @BeforeEach
    void setUp(){
        consumer = new ConsumerImpl();
    }

    @Test
    void testConsumer(){
        Consumer<String> printConsumer= consumer.printNames();
        Assertions.assertNotNull(printConsumer);
    }
}