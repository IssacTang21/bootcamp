package math;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {

  public static void main(String[] args) {
    Function<String, Integer> lengthFunc = str -> str.length();
    Function<String, Character> firstCharFunc = str -> str.charAt(0);

    System.out.println(lengthFunc.apply("abc")); // 3
    System.out.println(firstCharFunc.apply("month")); // m

    LengthFunction lengthFunction = new LengthFunction();
    System.out.println(lengthFunction.apply("def")); // 3

    Map<String, String> map = new HashMap<>();
    map.put("abc", "mary");
    // Function<String, String> formula = s -> "default";
    String result = map.computeIfAbsent("abc", s -> "default");
    System.out.println(result);
    System.out.println(map.size()); // 2


    // biFunction
    BiFunction<Integer, Integer, BigDecimal> addition = (x, y) -> BigDecimal.valueOf(x+y);
    System.out.println(addition.apply(-4, -3).abs()); // 7

    Map<String, Integer> stock = new HashMap<>();
    stock.put("clothes", 100);

    stock.compute("clothes", (item, oldPrice) -> (int) (oldPrice - oldPrice*0.1));
    System.out.println(stock.get("clothes")); // 90

    // new value: null, remove item
    stock.compute("clothes", (item, oldPrice) -> null);
    System.out.println(stock.size()); // 0

    //
    stock.compute("abc", (item, oldPrice) -> 120);
    System.out.println(stock.get("abc"));
  }
}
