import java.util.Random;
import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    // 1-100
    // bomb = 45 (random number)
    // user input = 35-100
    int bomb = new Random().nextInt(100) + 1; // 1 - 100
    Scanner s = new Scanner(System.in);
    int input, start = 1, end = 100;
    boolean bingo = false;
    do {
      System.out.println("Please input a number:" + start + " - " + end + " = ");
      input = s.nextInt();
      if (input > bomb) {
        end = input;
      } else if (input < bomb) {
        start = input;
      }
    } while (input != bomb);
    System.out.println("bingo!");
  }

}
