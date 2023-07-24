/*
 * Sum up to Zero
 */

// Input: n = 5
// Output: [-7,-1,1,3,4]
// Explanation: These arrays are also accepted [-5,-1,1,2,3], [-3,-1,2,-2,4].

// Input: n = 3
// Output: [-1, 1, 0] or [-3, 1, 2] or ...

// Input: n = 2
// Output: [-2, 2] or [-1, 1] or ...

// Input: n = 1
// Output: [0]

import java.util.Arrays;

public class JavaQuest16 {
  // Given an integer n (n > 0), Find n unique Integers Sum up to Zero

  // Do not change anything in main method
  public static void main(String[] args) {
    int[] nums = sumToZero(5); // n = 5
    int[] nums1 = sumToZero(3); // n = 3
    int[] nums2 = sumToZero(2); // n = 2
    int[] nums3 = sumToZero(1); // n = 1
    System.out.println(Arrays.toString(nums));
    System.out.println(Arrays.toString(nums1));
    System.out.println(Arrays.toString(nums2));
    System.out.println(Arrays.toString(nums3));
  }

  // Code a method to return int[].
  // 1. All values in this array sum up to Zero.
  // 2. The length of array = n
  // 3. The values in the array has to be unique
  public static int[] sumToZero(int n) {
    int[] arr1 = new int[n];
    int[] arr2 = new int[n]; 
    int[] arr3 = new int[n];
    for (int j = 0; j < n; j++){
      arr1[j] = j+1;
      arr2[j] = -(j+1);
    }
    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        arr3[i] = arr1[i];
      } else if (i % 2 == 1) {
        arr3[i] = arr2[i-1];
      }
    }
    if (n % 2 == 1){
      arr3[n-1] = 0;
    }
    return arr3;
  }
}