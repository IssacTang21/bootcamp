public class Wrapper2 {

  public static void main(String[] args) {
    int i = 10;
    Integer i2 = 10; // auto-boxing
    Integer i3 = Integer.valueOf(10);

    int i4 = i3; // un-boxing

    char c = 'a';
    Character c2 = c;
    char c3 = c2;

    byte b = 1;
    Byte b2 = b;
    byte b3 = b2;

    long l4 = 100; // int -> long
   // Long l = 10; // int -> Long , error
   Long l = 10L; 
   long l2 = l;
    Long l3 = l2;
  }
}
