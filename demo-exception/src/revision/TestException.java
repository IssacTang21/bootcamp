package revision;

public class TestException {

  public static int method(int amount) throws BusinessException {
    if (amount >= 0)
      return amount * 100;
    throw new BusinessException("amount < 0");
  }

  public static int method2(int amount) throws AbcException {
    if (amount >= 0)
      return amount * 1000;
    throw new AbcException();
  }

  // approach 2: throws the BusinessException in method signature
  public static void main(String[] args) throws BusinessException {
    // Exception // checked exception
    // RuntimeException // unchecked exception
    // approach 1: handle by try & catch
    try {
      int result = method(-2);
    } catch (BusinessException e) {
      System.out.println(e.getMessage());
    }
    int a = 10;
    if (a >= 0) {
      int result2 = method2(a); //dont need to handle runtime exception;
    }

  }
}
