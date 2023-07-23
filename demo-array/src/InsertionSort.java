import java.util.Arrays;

public class InsertionSort {
  public static void main(String[] args) {
    // [5, 1, 4, 8, 2]
    // Step1.1 : [1, 5, 4, 8, 2] (insert 1 to arr(0), 1 < 5)
    // after round 1, (1, 5) is sorted
    // Step2.1 : compare 1 < 5
    // Step2.2 : compare 1 < 4 -> (1, 4, 5)
    // after round 2, [1, 4, 5] is sorted
    int[] arr = new int[] { 5, 1, 4, 8, 2 };
    for (int i = 1; i < arr.length; i++) {
      int index = arr[i];
      int j;
      for (j = i - 1; j >= 0 && arr[j] > index; j--) {
          arr[j+1] = arr[j];
        }
        arr[j+1]=index;
        System.out.println(Arrays.toString(arr));
      }
    
    System.out.println(Arrays.toString(arr));
  }
}
