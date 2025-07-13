package Consumer;

import model.User;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerImpl {
//    @FunctionalInterface
//    public interface Consumer<T> {
//        void accept(T t);
//    }

    public Consumer<String> printNames() {
        List<String> names = Arrays.asList("Amir", "Hamza", "Java");
        Consumer<String> printName = name -> System.out.println("Name: " + name);
       // printName.accept(names.get(0));
        return printName;
    }

    public Consumer<String> printUppterCase() {
        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
        printUpperCase.accept("hello world"); // Output: HELLO WORLD
        return printUpperCase;
    }

    public Consumer<User> chainingConsumer(){

        Consumer<User> logUser = user -> System.out.println("Logging user: " + user.name);
        Consumer<User> saveUser = user -> System.out.println("Saving user: " + user.name);

        Consumer<User> processUser = logUser.andThen(saveUser);

        processUser.accept(new User("Hamza",23));
        return processUser;
    }

    public static void main(String[] args) {
        ConsumerImpl consumerImpl = new ConsumerImpl();
        Consumer<User> processUser = consumerImpl.chainingConsumer();
    }
}
