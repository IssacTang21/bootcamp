/**
 * Expected output:
 * 1 1 2 3 5 8 13 21 ...
 * 
 */
// Count the target of character in a String.
public class JavaQuest6 {
  public static void main(String[] args) {
    // for loop to print first 15 numbers in Fibonacci Sequence
    int a = 1;
    int b = 1;
    int sum = 2;
    System.out.print(a + " " + b + " ");
    for (int i = 3; i < 16; i++){
      sum = a + b;
      System.out.print(sum + " ");
      b = a;
      a = sum;
    }
  }
}