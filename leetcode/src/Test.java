import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Test {
  static byte counter = 5;
  int a = 2;

  public static void main(String[] args) {
    // int[] students = new int[]{1,2,3,4,5};
    // List<Integer> queue = new ArrayDeque<>(Arrays.asList(students));
  
    Test t = new Test();
    
    for(Integer i = 0; i < 2 ; i++){
      counter = (byte) (i + t.a);
    }
    System.out.println(counter);
  }
}
