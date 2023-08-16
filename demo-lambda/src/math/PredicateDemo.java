package math;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {

  public static void main(String[] args) throws Exception{
    // developer
    Predicate<Character> isMale = c -> c == 'M';
    System.out.println(isMale.test('F')); // false
    Predicate<String> isUppercase = s -> {
      for ( int i = 0 ; i < s.length(); i++){
        if ( s.charAt(i) < 65 || s.charAt(i) > 90)
        return false;
      }
    return true;
    };
    //tester
    test(isMale, 'F', false);
    test(isMale, 'M', true);
    test(isUppercase, "ABCaD", false);
    test(isUppercase, "ABCDD", true);

    // BiPredicate
    BiPredicate<String, String> equals = (s1, s2) -> s1 != null && s1.equals(s2);
    test(equals, "abc", "abc", true);
    test(equals, "abc", "bcd", false);
    test(equals, null, "abc", false);
    test(equals, "abc", null, false);
    test(equals, null, null, false);
    test(equals, null, "", false);
    test(equals, "", "", true);
  }

  public static <T> void test(Predicate<T> testcase, T data, boolean expectedResult) throws Exception{
    if (testcase.test(data) != expectedResult)
    throw new Exception();
  }

  public static <T, U> void test(BiPredicate<T, U> testcase, T data, U data2,  boolean expectedResult) throws Exception{
    if (testcase.test(data, data2) != expectedResult)
    throw new Exception();
  }
}
