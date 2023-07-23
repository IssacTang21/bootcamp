import java.util.Scanner;

public class DoWhileLoop {
  public static void main(String[] args) {
    int count = 0;
    do {
      System.out.println("hello, count = " + count);
      count++;
    } while (count < 3);

    int input = 0;
    Scanner scanner;
    do {
      scanner = new Scanner(System.in);
      System.out.println("please input a integer");
      input = scanner.nextInt();
      // if input is even -> continue
      // odd -> exit the loop and print the number

    } while (input % 2 == 0);
System.out.println("the number is "+input);
  }

}
