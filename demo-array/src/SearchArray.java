import java.util.Arrays;

public class SearchArray {
  public static void main(String[] args) {
    // search
    char target = 'm';
    char[] tar = new char[] { 'j', 'p', 'm', 'n', 'q', 'c' };
    // loop tp find the index of target in array chars
    for (int i = 0; i < tar.length; i++) {
      if (tar[i] == target) {
        System.out.println("the index of target is:" + i);
      }
    }

    // toCharArray()
    String str = "I am a boy."; // 11 characters
    char[] arr = str.toCharArray();
    System.out.println(Arrays.toString(arr));

  }

}
