public class String2 {
  public static void main(String[] args) { // method signature = method name + parametertype & quantity

    // trim(), remove leading space and trail space
    String str = "hello";
    String str2 = "   hel   lo  ";
    System.out.println("str.trim()=" + str.trim()); // hello
    System.out.println("str2.trim=" + str2.trim()); // hel lo

    // startwith(), check if the string start with target string
    if (str.startsWith("hel")) {
      System.out.println("the string is start with hel");
    }

    // endsWith(), check if the string end with target string
    boolean endsWithSpace = str.endsWith(" ");
    if (endsWithSpace) {
      System.out.println("The string end with space");
    }

    // indexOf
    System.out.println("the index of o is=" + str.indexOf('o')); // 4
    System.out.println("the index of ll is =" + str.indexOf("ll")); // 2
    System.out.println("the index of ll is =" + str.indexOf("lll")); // not found -> -1
    System.out.println("the index of o in str, search from index 5=" + str.indexOf('o', 5)); // -1
    System.out.println("the index of ll in str, search from index 5=" + str.indexOf("ll", 5)); // -1
    
    //lastIndexOf(int), the last ocurrence of the char/string in the string
    String str3 = "hello";
    System.out.println("the last index of l is=" + str3.lastIndexOf('l')); // 3
    System.out.println("the last index of ll is=" + str3.lastIndexOf("ll")); // 2
    System.out.println("the last index of l is=" + str3.lastIndexOf('l', 2)); // 2

     // replace
     String s = "Java is a programming language";
     System.out.println(s.replace("Java", "Python")); // Python is a programming language
     System.out.println(s.replace('p', 'q')); // Java is a qrogramming language
 
     // equals(), equalsIgnoreCase()
     if ("hello".equals(str3)) { // true
       System.out.println("str3 = hello");
     }
     if ("Hello".equals(str3)) { // false, case sensitive
       System.out.println("str3 = Hello");
     }
     if ("Hello".equalsIgnoreCase(str3)) { // true, non case sensitive
       System.out.println("non case sensitive checking");
     }
     if ("HELLO".equals(str3.toUpperCase())) { // true
       System.out.println("Alternative");
     }
 
     // concat(String), append something
     String newString = str3.concat(" Java!"); // + operation
     System.out.println("newString=" + newString); // hello Java!
     str3 = str3.concat(" Java!");
     System.out.println("str3=" + str3); // hello Java!
 
     // compareTo(), just compare the first character of the string (by ASCII)
     String apple = "apple";
     String facebook = "facebook";
     System.out.println(apple.compareTo(facebook)); // -5, 97 - 102 ('a' - 'f')
  }

}
