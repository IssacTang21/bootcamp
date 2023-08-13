/*
 * Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
 * 
 * The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
 * 
 */
public class JavaQuest46 {
  public static void main(String[] args) {
    System.out.println(findGCD(new int[] {2, 5, 6, 9, 10}));
    System.out.println(findGCD(new int[] {7, 5, 6, 8, 3}));
    System.out.println(findGCD(new int[] {3, 3}));

  }

  public static int findGCD(int[] nums) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for ( int i = 0; i < nums.length; i++){
      max = Math.max(nums[i], max);
      min = Math.min(nums[i], min);
    }

    int gcd = 0;
    for ( int j = 1; j <= min; j++){
      if (max % j == 0 && min % j == 0){
        gcd = j;
      }
    }
  return gcd;
  }

}