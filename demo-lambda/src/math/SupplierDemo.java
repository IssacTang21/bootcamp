package math;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierDemo {
  public static void main(String[] args) throws Exception {
    Supplier<LocalDate> now = () -> LocalDate.now();
    System.out.println(now.get()); // 2023-08-16

    test(now, LocalDate.of(2023, 8, 16));

    Supplier<Integer> random = () -> new Random().nextInt(3); // 0,1,2
    test(random, 3);
    // Supplier<Integer> random = () -> new Random().nextInt(3);
    // System.out.println(random.get());

    Predicate<LocalDate> isCoolingOff = effDate -> effDate.plusMonths(1).isAfter(LocalDate.now());
    PredicateDemo.test(isCoolingOff, LocalDate.of(2023, 7, 16), false);
  }

  public static <T> void test(Supplier<T> testcase,T result) throws Exception{
    if (testcase.get().equals(result))
    return;
    throw new Exception();
  }

 
}
