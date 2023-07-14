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

    for (int i = 0; i < 5; ++i) {
      System.out.println("hello");
      if (i > 2) {
        break;
      }
      // i = 0, hello
      // i = 1, hello
      // i = 2, hello
      // i = 3, hello
      // break
    }

    // continue
    for (int i = 0; i < 6; i++) {
      System.out.println("hello");
      if (i > 3) {
        continue; // go to the next iteration
      }
      System.out.println("bye");
    }
    // i = 0, hello, bye
    // i = 1, hello, bye
    // i = 2, hello, bye
    // i = 3, hello, bye
    // i = 4, hello
    // i = 5, hello
    // i = 6, exit

    for (int i = 0; i < 6; i++) {
      if (i % 2 == 0 && i % 3 == 0) {
        System.out.println("i=" + i);
      }
    }

    // nested loop
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.println("hello");
      }
    } // how many hello? 12
      // i = 0 , j = 0, hello
      // i = 0 , j = 1, hello
      // i = 0 , j = 2, hello
      // i = 0 , j = 3, exit
      // i = 1 , j = 0, hello
      // ...
      // i = 3 , j = 3, exit

      
    for (int i = 0; i < 5; i++) {
      String star = " ";
      for (int j = 0; j <= i; j++) {
        star += "*";
      }
      System.out.println(star);
    }

     // approach 1: nested loop
    // System.out.println() & System.out.print()
    for (int i = 0; i < 5; i++){
      for (int j = 0; j < i + 1; j++){
        System.out.print("*");
      }
      System.out.println("");
    }

    // Approach 2: single loop & string
    // System.out.println()
    String str = "";
    for (int i = 0; i < 5 ; i++){
      str += "*";
      System.out.println(str);
    }

    // Apporach 3:Nested loop & string
    // System.out.println()
    str = "";
    for (int i = 0; i < 5; i++){
      str = "";
      for (int j = 0; j < i + 1; j++){
        str += "*";
      }
      System.out.println(str);
    }

    //半邊菱形
    for (int i = 0; i < 5; i++){
      str = "";
      for (int j = 0; j < 5; j++){
        if (j < i + 1){
          str += "*";
        } else {
          str += " ";
        }
      }
      System.out.println(str);
    }

    for (int i = 4; i > 0; i--){
      str = "";
      for (int j = 4; j > 0; j--){
        if (j <= i){
          str += "*";
        }
      }
      System.out.println(str);
    }

    // 菱形
    int n = 5;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
          System.out.print(" "); // 打印空格
      }
      for (int k = 1; k <= 2 * i - 1; k++) {
          System.out.print("*"); // 打印星号
      }
      System.out.println(); // 换行
  }

  // 下半部分菱形
  for (int i = n - 1; i >= 1; i--) {
      for (int j = 1; j <= n - i; j++) {
          System.out.print(" "); // 打印空格
      }
      for (int k = 1; k <= 2 * i - 1; k++) {
          System.out.print("*"); // 打印星号
      }
      System.out.println(); // 换行
  }
   

  for (int i = 1; i < 11; i++){
    if (i % 2 == 0){
      System.out.println(i);
    }
  }

  for (int i = 1; i < 11; i++){
    if (i % 2 != 0){
      System.out.println(i * i);
    }
  }
  }
}