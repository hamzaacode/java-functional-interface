import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class TestMain {
    public static void main(String[] args) {
        //supplier T get();
        System.out.println(getStringSupplier().get());

        //predicate boolean test(T t);
        System.out.println(getPredicate().test(12));
        System.out.println(getPrimeNumberPredicate().test(33434));

        //function R apply(T t)
        System.out.println(getLowerCaseFunction().apply("Hello"));
        System.out.println(getVowelsCount().apply("Hello"));
        System.out.println(getVowels().apply("Hello"));

        // accept(T t)
        printString().accept("hello java");
    }

    //supplier
    public static  Supplier<String> getStringSupplier(){
        Supplier<String> strSupplier=()-> " Welcome to Java ";
        return strSupplier;
    }

    public static  Supplier<Stream<String>> getStreamSupplier(){
        Supplier<Stream<String>> strSupplier=()-> List.of(new String("hello")).stream();
        return strSupplier;
    }

    // predicate

    public static Predicate<Integer> getPredicate(){
        Predicate<Integer> evenNumberPredicate=num->num%2==0;
        return evenNumberPredicate;
    }

    public static Predicate<Integer> getPrimeNumberPredicate(){
        Predicate<Integer> primeNumberPredicate=num->{
            if(num<=1)return false;
            for(int i=2;i<num;i++){
                if(num%i==0) {
                    return false;
                }
            }
            return true;
        };
        return primeNumberPredicate;
    }

    // function

    public static Function<String,String> getLowerCaseFunction(){
        Function<String,String> lowerCaseFunction=str->str.toLowerCase();
        return lowerCaseFunction;
    }

    public static Function<String,Integer> getVowelsCount(){
        Function<String,Integer> vowelsCount=str-> {
            char[] cArr=str.toCharArray();
            String vowels="aeiou";
            int count=0;
            for(Character c:cArr){
                if(vowels.contains(String.valueOf(c))){
                    count++;
                }
            }
            return count;
        };
        return vowelsCount;
    }

    public static Function<String,String> getVowels(){
        Function<String,String> vowelsCount=str-> {
            char[] cArr=str.toCharArray();
            String vowels="aeiou";
           StringBuilder sb=new StringBuilder();
            for(Character c:cArr){
                if(vowels.contains(String.valueOf(c))){
                    sb.append(c);
                }
            }
            return sb.toString();
        };
        return vowelsCount;
    }

    public static Consumer<String> printString(){
        Consumer<String> printList=str->{
            System.out.println(str.toString());
        };
        return printList;
    }
}
