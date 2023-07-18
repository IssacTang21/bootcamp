public class Methods {

  public static void print() { // method name -> print()
    System.out.println("hello in print method");
  }

  public static int a(int a, int b) {
    // left int = return type
    // the int inside the bracket are parameters
    int c = a + b;
    return c;
  }

  public static void main(String[] args) { // Method name -> main()
    String str = "hello";
    str += str + "world"; // append operation

    // approach 1
    System.out.println("hello in print method");
    // approach 2: by method
    print(); // print "hello in print() method"

    // approach 1
    int x = 10;
    int y = 100;
    int m = x + y; // 110

    // approach 2
    int z = a(x, y); // z = 110
    int i = a(1000, -70); // 930
    if (i == 930) {
      System.out.println("the sum is 930");
    }

    // call method2
    method2("hello");
    method2("Github");

    double circleArea = 5 * 5 * pie();
    System.out.println(circleArea);
  }

  public static int sub(int x, int y) {
    return x - y; // execute x - y, then return the result
  }

  public static void method2(String str) { // void -> nothing reutrn
    if (str == null || "".equals(str)) { // null is not empty, empty -> ""
      return; // void can use return
    }
    System.out.println("String = " + str);
  }

  public static double pie() {
    return 3.14159;
  }

}
