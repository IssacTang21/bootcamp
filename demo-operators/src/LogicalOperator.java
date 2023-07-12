public class LogicalOperator {
  public static void main(String[] args) {
    boolean isExpensive = true;
    boolean isWorthToBuy = false;
    // && operator -> and
    // true, true -> true
    // true, false -> false
    // false, true -> false
    // false, false -> false
    boolean result = isExpensive && isWorthToBuy; // false
    // || operator -> or
    // true, true -> true
    // true, false -> true
    // false, true -> true
    // false, false -> false
    boolean result2 = isExpensive || isWorthToBuy; // true

    int a = 5;
    int b = 10;
    int c = 13;
    boolean result3 = a > 6 && b < 12; // false
    boolean result4 = a > 6 || b < 12; // true
    // logical Operator
    boolean result5 = c < 15 || a > 6 && b < 12; // true
    boolean result6 = c < 15 || (a > 6 && b < 12); // true
    boolean result7 = a < 6 || b < 9 || c < 9; // true

    // == , <= , >=, !=
    // ==, means asking if a equals b? -> true/false
    // =, assignmnet
    boolean result8 = a == b; // false
    boolean result9 = a <= b; // true
    boolean result10 = a >= b; // false
    boolean result11 = c != 13; // false

    // ! -> not
    // asking if the event of (c < 13) is false
    boolean result12 = !(c < 13); // true
    boolean result13 = !(b == 9) && c != 13; // false

    // Operator Precedence
    int result14 = (1 + 9) * 3; // 30
    int result15 = ++result14 + 1; // 32
    int i = 27;
    int result16 = i++ + 1; // i = 28 , result16 = 28
    System.out.println("i=" + i);
    System.out.println("result16=" + result16);

    boolean result17 = 25 + 2 < result16 + 1; // true

    //
    int x = 5;
    int y = 10;
    int z = x += 3 * y; // 1. 3 * 10 = 30, 2. 5 + 30 ->35
    // int result18 = x++ + (2 * x++); // result18 = ? 
    int result18 =x++ + 2 * x++; // result18 = ? 
    // (x++ + 2) -> 7, x -> 6
    // 7 * 6 -> 42, x -> 7
    System.out.println("result18=" + result18);
    System.out.println("x=" + x);
  }

}
