public class Datatype {
  public static void main(String[] args){
    int num;
    // declaration
    num = 3; // from right to left 
    // assignment
    System.out.println(num);
    System.out.println("3");
    System.out.println(3);

    // text
    String str = "hello";
    System.out.println(str);
    String str2 = "3";
    System.out.println(str2);

    float num3 = 1.3f;
    System.out.println(num3);

    double f = 1.03;
    double f2 = 1;
    // double can assign integer

    byte num5 = 56;
    System.out.println(num5);

    short str3 = 3456;
    System.out.println(str3);

    long num6 = 12345678901L;
    System.out.println(num6);

    boolean a = true;
    System.out.println(a);

    char str7 = 345;
    System.out.println(str7);
// char value should be single quote
    
    String str8 = "Hello ";
    String str9 = "world!";
    String str10 = str8 + str9;
    System.out.println(str8 + str9);
    System.out.println(str8 + str9 + 42);
    System.out.println(str10);

    int b = 1 + 3;
    int c = 1 - 3;
    int d = 3 * 3;
    int e = 1 / 4;
    int g = 10 % 3; // remainder 
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(g);
    System.out.println(b-c);
  }
}
