public class String1 {
  public static void main(String[] args) {
    // length(), equals(), charAt()
    String str = "Hello";
    System.out.println(str.isEmpty()); // false
    String str2 = "";
    System.out.println(str2.isEmpty()); // ture
    String str3 = " ";
    System.out.println(str3.isEmpty()); // false

    // isBlank()
    System.out.println(str.isBlank()); // false
    System.out.println(str2.isBlank()); // true
    System.out.println(str3.isBlank()); // true

    // toLowerCase, toUpperCase()
    System.out.println(str.toUpperCase()); // HELLO
    System.out.println(str);
    System.out.println(str.toUpperCase().toLowerCase()); // hello
    if (str.toUpperCase().equals("HELLO")){
      System.out.println("yes, it is HELLO");
    }

    // method 1 : substring (start index, end index -1))
    // hello -> he
    System.out.println(str.substring(0, 2)); // he
    System.out.println(str.substring(2, 4)); // ll
    System.out.println(str.substring(0, 5)); // Hello
    // method 2 : substring (start index) -> the end index default to the last index
    // of string
    // hello -> llo
    System.out.println(str.substring(2)); // llo
    if (str.substring(3).equals("lo")) { // string should not use ==
      System.out.println("yes, str.substring(3) = lo");
    }

    // contains()
    String s = "lo";
    System.out.println(str.contains(s)); // true (hello contains lo)
    System.out.println(str.contains(s)); // false (hello Not contains ol)
    if (str.contains(s)) {
      System.out.println("str contains lo");
    }
    str = str.toUpperCase(); // the variable will change only if the = is appeared
    System.out.println(str);
    str += str.toLowerCase(str); 
    System.out.println(str); // HELLOhello
  }
}