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
    char[] arr = str.toCharArray(); // length 11
    // System.out.println(arr[11]); // error
    System.out.println(Arrays.toString(arr));

    // find max. value in the array
    int[] arr3 = new int[] { -5, -3, -9, -10, -3 };
    int max = arr3[0]; // the min. of int
    for (int i = 0; i < arr3.length; i++) {
      if (arr3[i] >= max) {
        max = arr3[i];
      }
    }
    System.out.println("the max value in the array:" + max);

    // find Min. value in the array
    int[] nums2 = new int[] { -24, 800, -23, 6, 98 };
    int min = nums2[0]; // the max of int
    for (int i = 0; i < arr3.length; i++) {
      if (nums2[i] <= min) {
        min = nums2[i];
      }
    }
    System.out.println("the min value in the array:" + min);

    
  }
}