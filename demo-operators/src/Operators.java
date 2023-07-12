public class Operators {
  public static void main(String[] args) {
    int a = 1;
    a = a + 1; // 2
    a = a - 2; // 0
    int b = 10 / 5; // 2
    b = b * 3 + 5; // 11
    System.out.println("a ppend b=" + a + b);

    // + 1 operation
    int x = 1;
    x = x + 1;
    x++; // means x = x + 1;
    ++x; // means x = x + 1;
    x += 1; // means x = x + 1;
    System.out.println("x=" + x); // x=5

    // - 1 operation
    int y = 10;
    y = y - 1;
    y--;
    --y;
    y -= 1;
    System.out.println("y=" + y); // y=6

    // other +,-,*,/
    int z = 4;
    z = z + 2;
    z += 2;
    int i = 6;
    i = i - 3;
    i -= 3;
    int w = 9;
    w *= 3;
    int u = 81;
    u = u / 9;
    u /= 3;
    int integer = 12 % 5; // 2
    int integer2 = 12;
    integer2 %= 5; // 2

    // ++, --
    int m = 3;
    m++; // 4
    int preIncrement = ++m; // ++ first? assignment first?
    System.out.println("preIncrement=" + preIncrement); // 5
    int postIncrement = m++;
    System.out.println("postIncrement=" + postIncrement);// 5
    System.out.println("m=" + m);

    int g = 6;
    g--; // 5
    int preDecrementG = --g;
    System.out.println("preDecrementG=" + preDecrementG); // 4
    int postDecrementG = g--;
    System.out.println("postDecrementG=" + postDecrementG); // 4
    System.out.println("g=" + g); // 3

    // string +=
    String str = "hello";
    str += " World!"; // hello world!
    System.out.println(str);

  }
}
