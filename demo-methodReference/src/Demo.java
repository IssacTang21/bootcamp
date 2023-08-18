import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Demo {
    public static void main(String[] args) throws Exception {
       Consumer<String> sysout = s -> System.out.println(s);
       Consumer<String> sysout2 = System.out::println; // static method

       Arrays.asList("abc", "bef").forEach(sysout2);

       String name = "John";
       Supplier<Integer> strLength = () -> "abc".length();
       Supplier<Integer> strLength2 = name::length;

       List<String> words = Arrays.asList("apple", "orange", "banana");
       Comparator<String> compare = (s1, s2) -> s2.compareTo(s1);
       Comparator<String> compare2 = String::compareTo;

       Function<String, Integer> stringToInteger = str -> Integer.valueOf(str);
       Function<String, Integer> stringToInteger2 = Integer::valueOf;
       //Constructor 
       Function<String, Integer> stringToInteger3 = Integer::new;
    }
}