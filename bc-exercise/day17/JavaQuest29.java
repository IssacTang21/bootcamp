/*Question : Given an integer n,
 add a dollar sign ("$") and a comma (",") as the thousands separator and return it in string format. */
/*Constraints:

0 <= n <= 231 - 1 */
public class JavaQuest29 {
  public static void main(String[] args) {
    System.out.println(separator(85));// $85
    System.out.println(separator(0));// $0
    System.out.println(separator(1000));// $1,000
    System.out.println(separator(123987405));// $123,987,405

  }

  public static String separator(int n) {
    // code here
    StringBuilder str = new StringBuilder(Integer.toString(n));
    //char[] arr = new char[str.length()];
    StringBuilder newstr = new StringBuilder("$");
     int count = 0;
    for (int i = str.length()-1; i >= 0; i--) {
      // arr[i] = str.charAt(str.length()-1-i);
      if (count == 2 && i !=0) {
        newstr.insert(1, ","+str.charAt(i));
        count = 0;
      } else{
        newstr.insert(1, str.charAt(i));
        count++;
      }
    }
    return newstr.toString();
  }

}