public class Primitives {
  public static void main(String[] args) {
    // correct syntax
    // upcasting (implicit conversion / promotion)
    // byte -> short -> int -> long -> float -> double
    // char -> int
    byte b = 127;
    short s = b; // byte -> short, upcasting (promotion)
    int i = s;
    long l = i;
    float f = l;
    double d = f;
    char c = 'a';
    int j = c;

    // downcasting
    double d2 = 10.5d;
    // float f2 = d2; // why error? double precision is larger than float
    float f2 = (float) d2; // developer take responsibility for the risky

    short s2 = 129;
    // byte b2 = s2; // error
    byte b2 = (byte) s2;
    System.out.println(b2);

    // for (byte n = 127; n < 128; n++) { // 127 -> -128
    // System.out.println(n);
    // }

    // int[] arr = new int[Integer.MAX_VALUE];
    // for (int n = 0; n < arr.length; n++) {

    // }

    char c2 = 'B'; // 66, ASCII code
    if (c2 == 66) {
      System.out.println(c2);
    }

    char c3 = 67;
    if (c3 == 'C') {
      System.out.println("c3 is C");
    }

    // ASCII (int) to char
    int g = 'a';
    int g2 = 10;
    char k = (char) g2; // downcasting
    char k2 = 66; // 66 is ASCII code

    //
    int n = (int) 1000L; // downcasting, Explicit conversion
    int r = 9;
    byte o = 9; // number within the range of byte
    byte x = (byte) r; // r is variable, so check the type of r first-> error -> need downcasting

    char character = 'a' + 1;
    if (character == 'b'){
      System.out.println("character=" + character);
    }
    if (character == 98){
      System.out.println("character=" + character);
    }
    if (character > 'a'){
      System.out.println("character > a");
    }

  }

}
