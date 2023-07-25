public class Integer3 {

  // internal cache (-128 to 127)
  public static void main(String[] args) {
    Integer i1 = 100;
    Integer i2 = 100;
    System.out.println(i1 == i2); // address, true

    Integer i3 = 128;
    Integer i4 = 128;
    System.out.println(i3 == i4); // address, false

    Integer i5 = -128;
    Integer i6 = -128;
    System.out.println(i6 == i5); // address, true

    Byte b1 = 127;
    // Byte b2 = new Byte(127); // destroy Internal Cache

    // short, long
    Short s1 = 2000;
    Short s2 = 2000;
    System.out.println(s1 == s2); // false

    Long l1 = 123456789l;
    Long l2 = 123456789l;
    System.out.println(l1 == l2); // false


    // no Internal Cache in Float & Double
    Float f1 = 1.1f;
    Float f2 = 1.1f;
    System.out.println(f1 == f2); // false

    Double d1 = 2.2;
    Double d2 = 2.2;
    System.out.println(d1 == d2);// false

    Boolean bool1 = true;
    Boolean bool2 = true;
    System.out.println(bool1 == bool2); // true, same address

    // Internal Cache -> ASCII
    Character c1 = 'a';
    Character c2 = 'a';
    Character c3 = 'Ϩ';
    Character c4 = 'Ϩ';
    System.out.println(c3 == c4); // false, not same address
    System.out.println(c1 == c2); // true, same address

    Integer i7 = Integer.valueOf(127); // 127
    Integer i8 = 127;
    System.out.println(i7 == i8); // true

    Integer i9 = Integer.valueOf(128); // 128
    Integer i10 = 128;
    System.out.println(i9 == i10); // false
  }
}
