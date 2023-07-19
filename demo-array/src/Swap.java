import java.util.Arrays;

public class Swap {
  // public static void main(String[] args) {
  //   int[] arr = new int[] { 100, -400, 3, 99 };
  //   // code here...
  //   int a = arr[0];
  //   arr[0] = arr[3];
  //   arr[3] = a;
  //   for (int i = 0; i < arr.length; i++) {
  //     System.out.print(arr[i] + ", ");
  //   }
  // }

  // swap
  public static String SwapOddEvenCharacter(String str) {
    // hello -> ehllo
    // abcd -> badc
    // abcdef -> badcfe
    char[] ch = str.toCharArray();
    for (int i = 0; i < ch.length - 1; i++) {
      char temp;
      if (i % 2 == 0 && i != (ch.length-1)) {
        temp = ch[i];
        ch[i] = ch[i + 1];
        ch[i + 1] = temp;
      }
    }

    // approach 1
    // str = "";
    // for ( int j = 0; j < ch.length; j++){
    //   str += ch[j];
    // }
    // return str;

    // approach 2
    return String.valueOf(ch); // static method
    
  }

  public static void main(String[] args){
    String str = "abcdef";
    str = SwapOddEvenCharacter(str);
    System.out.println(str);
  }

}
