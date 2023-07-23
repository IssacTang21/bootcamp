public class WhileLoop {
  public static void main(String[] args) {
    // while
    int count = 0;
    while (count < 5) { // continue condition , true / false
      count++;
    }

    // count = 5

    boolean isHoliday = false;
    int count2 = 0;
    while (!isHoliday) { // is not holiday
      System.out.println("count2 = " + count2);
      count2++;
      if (count2 >= 6) {
        isHoliday = true;
      }
    }

    int c = 0;
    while (c >= 0 && c < 5) {
      System.out.println(c);
      c++;
    }

    int a = 0;
    int b = 10;
    while (a < 5 || b > 0) {
      System.out.println("hello");
      a++;
      b--;
    }

    int k = 0;
    while (k < 0) {
      System.out.println("break: hello");
      k++;
      if (k > 3) {
        break;
      }
    }

    int j = 0;
    while (j < 6) {

      j++;
      if (j > 3) {
        continue;
      }
      System.out.println("break: hello");
    }
  }
}
