import java.util.Arrays;

public class Foreach {
  public static void main(String[] args) {
    // basic for loop
    for (int i = 0; i < 5; i++) {
      System.out.println("basic for loop hello");
    }

    // difference of for-each
    // 1. for-each do not have stop condition / counter in loop signature
    // 2.
    // for-each loop
    int[] arr = new int[] { 1, 3, 3, 4 };
    // for (dataset)
    for (int x : arr) { // loop through all element, can't modify
      System.out.println("for-each hello, x = " + x);
      System.out.println(arr[x - 1]); // but you still access element by index
      // modify
      arr[0] = 8;

    }

    String[] strs = new String[] { "hello", "world", "java" };
    for (String strs2 : strs) {
      System.out.println(strs2);
    }

    Character[] chars = new Character[] { 'a', 'b', 'c', 'd' };
    for (Character c : chars) {
      System.out.println(c);
    }

    String s2 = "hello world ! I am Vincent";
    String[] strings = s2.split(" ");
    for (String s : strings) {
      System.out.println(s);
    }

    // // without using split, use a for loop to split s2
    // approach 1
    int count = 1;
    for (int i = 0; i < s2.length(); i++) {
      if (s2.charAt(i) == ' ') {
        count++;
      }
    }
    String[] strings2 = new String[count];
    for (int j = 0; j < s2.length(); j++) {
      if (s2.charAt(j) != ' ') {
        System.out.print(s2.charAt(j));
      }
      if (s2.charAt(j) == ' ' || (j == s2.length() - 1)) {
        System.out.println("");
      }
    }

    // approach 2
    // toCharArray
    char[] s2c = s2.toCharArray();
    int index = 0;
    for (int i = 0; i < s2.length(); i++) {
      if (s2c[i] != ' ') {
        strings2[index] += s2c[i];
      } else {
        index++;
      }
    }

    // Approach 3
    // substring
    int start = 0;
    int end = 0;
    int count2 = 0;
    for (int i = 0; i < s2.length(); i++) {
      if (s2.charAt(i) == ' ') {
        end = i ;
        strings2[count2] = s2.substring(start, end);
        start = i + 1;
        count2++;
      }
      if (i == s2.length() - 1){
        end = i+1;
        strings2[count2] = s2.substring(start, end);
      }
    }
    System.out.println(Arrays.toString(strings2));
  }
}
