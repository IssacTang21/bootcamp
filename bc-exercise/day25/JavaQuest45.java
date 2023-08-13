/*
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
 * 
 * Note that after backspacing an empty text, the text will continue empty.
 */
public class JavaQuest45 {
  public static void main(String[] args) {
    System.out.println(backspaceCompare("ab#c", "ad#c"));
    System.out.println(backspaceCompare("ab##", "c#d#"));
    System.out.println(backspaceCompare("a#c", "b"));

  }

  // Approach 1
  public static boolean backspaceCompare(String s, String t) {
    StringBuilder temp = new StringBuilder(s);
    StringBuilder temp2 = new StringBuilder(t);
    for (int i = 0; i < temp.length(); i++) {
      if (temp.charAt(i) == '#') {
        temp.replace(i - 1, i + 1, "");
      }
    }
    if (temp.charAt(temp.length() - 1) == '#')
      temp.replace(temp.length() - 2, temp.length(), "");
    for (int j = 0; j < temp2.length(); j++) {
      if (temp2.charAt(j) == '#') {
        temp2.replace(j - 1, j + 1, "");
      }
    }
    if (temp2.charAt(temp2.length() - 1) == '#')
      temp2.replace(temp2.length() - 2, temp2.length(), "");
    return temp.toString().equals(temp2.toString());
  }

}