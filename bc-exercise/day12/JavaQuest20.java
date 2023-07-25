/*
 * Question : Given two strings s and goal, 
 * return true if and only if s can become goal after N shifts on s.

Definition of a shift:
Moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.

Assume the input need to be lowercase English letters.
*/
public class JavaQuest20 {

  public static void main(String[] args) {
    System.out.println(rotateString("abcde", "cdeab"));// true
    System.out.println(rotateString("abcde", "abced"));// false
    System.out.println(rotateString("abcde", "eabcd"));// true
    System.out.println(rotateString("abcde", "abcde"));// true
  }

  public static boolean rotateString(String s, String goal) {
    // char temp = ' ';
    // char[] chars = s.toCharArray();
    // for (int j = 0; j < s.length(); j++) {
    // temp = chars[s.length() - 1];
    // for (int i = s.length() - 1; i > 0; i--) {
    // chars[i] = chars[i - 1];
    // }
    // chars[0] = temp;
    // System.out.println(s.valueOf(chars));
    // if (s.valueOf(chars).equals(goal))
    // return true;
    // break;
    // }
    // return false;
    // }

    StringBuilder s2 = new StringBuilder(s);
    for (int i = 0; i < s.length(); i++) {
      s2.append(s2.charAt(0)).deleteCharAt(0);
      if (s2.toString().equals(goal)) {
        return true;
      }
      if (s2.toString().equals(goal)){
        break;
      }
     
    }
  return false;
  }
}