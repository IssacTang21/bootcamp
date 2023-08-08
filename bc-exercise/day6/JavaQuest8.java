/**
 * Example Output
 * Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {

    int[] nums = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] nums4 = new int[] { -10, 5, 100, 240, 80, 240 }; // Second Max = 240

    // Your program should be able to handle all the above test case.
    int secondMax = nums4[0];
    int max = nums4[0];
    // code here
    for (int i = 0; i < nums.length; i++) {
      if (nums4[i] >= secondMax) {
        secondMax = nums4[i];
      }
      if (secondMax >= max) {
        secondMax = max;
        max = nums4[i];
      }
      // nums[i] = -10, secondmax = -10, max = -10
      // nums[i] = 5, secondmax = -10, max = -10
      // nums[i] = 5, secondmax = 5, max = -10
      // nums[i] = 5, secondmax = -10, max = -10
      // nums[i] = 5, secondmax = -10, max = 5;
    }
    System.out.println("the second max number is:" + secondMax);

  }
}