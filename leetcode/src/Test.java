import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Test {


  public static void main(String[] args) {
   System.out.println(Arrays.toString(findRanks(new int[]{10,3,8,9,4})));
   char[] temp = new char[]{1,2,3,4,5,6};
  }

  public static String[] findRanks(int[] score) {
    int n = score.length;
    
    // Sort the scores in descending order
    Arrays.sort(score);
    String[] answer = new String[n];
    
    // Initialize position and rank
    int position = 1;
    
    for (int i = n - 1; i >= 0; i--) {
        if (position == 1) {
            answer[i] = "Gold Medal";
        } else if (position == 2) {
            answer[i] = "Silver Medal";
        } else if (position == 3) {
            answer[i] = "Bronze Medal";
        } else {
            answer[i] = String.valueOf(position);
        }
        position++;
    }
    
    return answer;
}
}
