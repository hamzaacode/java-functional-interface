package Function;

import java.util.function.Function;

public class FunctionImpl {

//    @FunctionalInterface
//    public interface Function<T,R>{
//       R apply(T t);
//    }

    public Function<String, Integer> getLengthFunction() {
        Function<String,Integer> function= s->s.length();
        return function;
    }

    public Function<Double, Double> celsiusToFarenHeit() {
        Function<Double,Double> function = c -> (c * 9/5) + 32;
        return function;
    }

    public Function<String, String> convertNameIntoUpperCase() {
        Function<String, String> function = s -> s.toUpperCase();
        return function;
    }

    public Function<String, Long> getVowelsCount(){
        Function<String,Long> vowelsCount=word-> {
          char[] chArray=  word.toLowerCase().toCharArray();
          long count=0;
          String vowels="aeiou";
          for(Character c:chArray){
              if(vowels.contains(String.valueOf(c))){
                  count++;
              }
          }
            return count;
        };
        return vowelsCount;
    }
}
