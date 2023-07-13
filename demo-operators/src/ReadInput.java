import java.util.Scanner; // important

public class ReadInput {
  public static void main(String[] args) {
    // scanner -> read system input
    System.out.println("Please input an integer");
    Scanner s = new Scanner(System.in);
    int input = s.nextInt(); // read user input, expecting it is an integer
    System.out.println("input=" + input);

    for (int i = 0; i < input; i++) {
      System.out.println("i=" + i + ", hello");
    }
  }

}
