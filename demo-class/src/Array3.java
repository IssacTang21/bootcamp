public class Array3 {
  public static void addline(int[] arr) { // pass by reference
    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] +1;
    }
 //   return arr;
  }

  // ALL Wrapper class + String -> pass by value
  public static String concat(String s1, String s2){ // pass by value
    s1 = "hello";
    return s1 + s2;
  }

  public static void main(String[] args) {
    int[] nums = new int[] { 3, 4, 5 };
    addline(nums); // 4, 5, 6

    for (int j = 0; j < nums.length; j++) {
      System.out.println(nums[j]);
    }

    // call concat
    String a = "abc";
    String b = "def";
    concat(a, b); // hellodef
    // a = abc;
    // b = def;
  }
}
