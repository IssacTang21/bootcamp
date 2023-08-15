/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false */

import java.util.Arrays;
import java.util.Stack;

public class JavaQuest48 {
  public static void main(String[] args) {
    System.out.println(isValid("()")); // true
    System.out.println(isValid("()[]{}"));// true
    System.out.println(isValid("(]"));// false
    System.out.println(isValid("([{}]){[]}"));// true

  }

  public static boolean isValid(String s) {
    int[] count = new int[6];
    for (int i = 0; i < s.length(); i++) {
      switch (s.charAt(i)) {
        case '(':
          count[0]++;
          break;
        case ')':
          count[1]++;
          break;
        case '[':
          count[2]++;
          break;
        case ']':
          count[3]++;
          break;
        case '{':
          count[4]++;
          break;
        case '}':
          count[5]++;
          break;
      }
    }

    if (count[0] != count[1])
      return false;
    if (count[2] != count[3])
      return false;
    if (count[4] != count[5])
      return false;

    return true;

  }

}