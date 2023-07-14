public class ProductSequence {
  public static void main(String[] args) {
    // 0, 1, 2, 3, 4, 5...
    // print out 0, 2, 6, 12, 20...
    // print the first 20 number, based on the above requiremnet
    int count = 0;
    for (int i = 0; i < 100; i++) {
      int result = (i * (i + 1));
      System.out.print(result + ",");
      count++;
      if (count == 20) {
        System.out.println("...");
        break;
      }
    }

    // module ans
    int a, b, c; // declare 2 variables in one line
    for (int i = 0; i < 20; i++) {
      a = i;
      b = i + 1;
      c = a * b;
      System.out.println(c + " ");
    }
  }

}
