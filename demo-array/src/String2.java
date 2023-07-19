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
System.out.println("the last index of l is=" + )
  }

}
