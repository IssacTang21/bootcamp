public class Splits {
 
  public static void main(String[] args) {
    String s = "abc def xyz";

    for ( String str : s.split(" ")){
      System.out.println(str);
    }

    String s2 = "abc    def   xyz pld";
    for ( String str : s2.split("\\s")) { // \s means space, \\s+ means one or many space
      System.out.println(str);
    }
  }
}
