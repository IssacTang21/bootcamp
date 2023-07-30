import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleProblem {

  private BigDecimal length;
  public void setLength(BigDecimal length){
    this.length = length;
  }

  public static void main(String[] args) {
DoubleProblem a = new DoubleProblem();
a.setLength(5);



    double result = 0.1 + 0.2;
    System.out.println(result);

    if (result == 0.3)
      System.out.println("result = 0.3");
    else
      System.out.println("result != 0.3");

    System.out.println(0.3 / 0.1);
    System.out.println(0.2 * 0.2);

    // solution
    BigDecimal b = new BigDecimal(5);
    BigDecimal b2 = BigDecimal.valueOf(4);
    // BigDecimal b2 = 5.0; //Not ok
    Double d = 5.0;
    System.out.println(b);
    System.out.println(b.multiply(b)); // 25
    System.out.println(b.subtract(b)); // 5 - 5 = 0
    System.out.println(b.add(b)); // 5 + 5 = 10
    System.out.println(b.divide(b)); // 5 / 5 = 1
    System.out.println(b.add(new BigDecimal(7))); // 5 + 7 = 12

    // if (b.compareTo(b2) == 1)
    System.out.println(b.compareTo(b2)); // b = 5, b2 = 4 -> 1
    System.out.println(b2.compareTo(b)); // b = 5, b2 = 4 -> -1
    System.out.println(b.compareTo(b)); // b = 5 -> 0

    BigDecimal b3 = BigDecimal.valueOf(3.456102);
    System.out.println(b3.setScale(3, RoundingMode.UP)); // 3.457
    System.out.println(b3.setScale(3, RoundingMode.DOWN)); // 3.456
    System.out.println(b3.equals(b2)); // 3.456102 != 4 -> false
    
  }
}
