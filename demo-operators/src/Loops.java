public class Loops {
  public static void main(String[] args) {
    // for loop
    for (int i = 0; i < 4; ++i) {
      System.out.println("i=" + i + ", hello");
      // i = 0, 1st hello
      // i = 1, 2nd hello
      // i = 2, 3rd hello
      // i = 3, 4th hello
    }

    for (int x = 10; x > 5; --x) {
      System.out.println("x=" + x);
    }

    int max = 10;
    int count = 0;
    for (int i = 0; i < max; ++i) {
      count += i;
    }
    System.out.println(count);
    // count = 45

    int sum = 0;
    int sumOddNumberWithout5 = 0;
    for (int i = 0; i < 10; i++) {
      // odd number
      if (i % 2 != 0) {
        sum += i;
      }
      if (i % 2 == 1 && i != 5) {
        sumOddNumberWithout5 += i;
      }
    }
    System.out.println(sum + "," + sumOddNumberWithout5); 
    // sum = 25
    // sumOddNumberWithout5 = 20

    for (int i = 0; i < 5; ++i){
      System.out.println("hello");
      if (i > 2){
        break;
      }
      // i = 0, hello
      // i = 1, hello
      // i = 2, hello
      // i = 3, hello
      // break
    }

    
  }

}
