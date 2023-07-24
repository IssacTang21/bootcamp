import java.util.Arrays;

public class method2 {
  public static void main(String[] args){
int[] nums = new int[]{1, 2,10 ,3, 4, 20};
products(nums);
System.out.println(Arrays.toString(nums));
  }

public static void products(int[] arr){
// 2, 20, 30, 12, 80, 20
for (int i = 0; i < arr.length - 1; i++){
arr[i] = product(arr[i], arr[i+1]);
}
// return arr;

}

  public static int product(int x, int y){
    return x * y;
  }
  
}
