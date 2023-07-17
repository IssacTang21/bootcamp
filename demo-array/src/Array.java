import java.util.Arrays;

public class Array {
  public static void main(String[] args) {
    int num = 7;
    int num2 = 8;
    int num3 = -30;

    // create empty array
    int[] arr = new int[3]; // 3 is the length of array arr
    // with index 0, 1, 2
    arr[0] = -40;
    arr[1] = 500;
    arr[2] = -1000;
    arr[0] = 500000;
    // arr[-1] = 100; //ArrayIndexOutOfBoundsException: Index -1 out of bounds for
    // length 3
    // num[3] = 5 // index 3 out of bounds for length 3

    // your turn
    // double[]
    double[] arr2 = new double[6];
    arr2[0] = 404040;
    arr2[1] = 123.45;
    arr2[2] = -1029.4;

    // char[], int[], String[]
    // for loop
    for (int i = 0; i < arr.length; i++) { // arr.length -> 3, array.lengt後面無()
      System.out.println("arr[" + i + "]=" + arr[i]);
    }
    // reversely print array arr
    for (int j = (arr.length - 1); j >= 0; j--) {
      System.out.println("arr[" + j + "]=" + arr[j]);
    }

    // approach 2
    int[] array = new int[] { 3, 4, 5 };
    for (int i = 0; i < array.length; i++) {
      System.out.println("array[" + i + "]=" + array[i]);
      // can add a new element at tail? No
      // Modify an element
      array[2] = -10;
      // access an element
      int index = 2;
      System.out.println(array[index]); // -10
    }
    // char[]
    char[] chars = new char[3];
    chars[2] = 'a';
    chars[0] = '!';
    for (int i = 0; i < chars.length; i++) {
      System.out.println("arr[" + i + "]=" + chars[i]);
    }

    long[] numbers = new long[4];
    numbers[1] = 123;
    for (int i = 0; i < numbers.length; i++) {
      System.out.println("arr[" + i + "]=" + numbers[i]);
    }

    boolean[] arr3 = new boolean[2];
    arr3[0] = true;
    for (int i = 0; i < arr3.length; i++) {
      System.out.println("arr[" + i + "]=" + arr3[i]);
    }

    // string
    String[] strs = new String[]{"hello", "abbc", "bye"};
    strs[1] = "typhoon";
    for (int i = 0; i < strs.length; i++) {
      System.out.println("arr[" + i + "]=" + strs[i]);
    }

    String[] fruits = new String[5];
    fruits[0] = "apple";
    fruits[1] = "watermelon";
    fruits[2] = "orange";
    System.out.println(Arrays.toString(fruits));

    byte[] bytes = new byte[5];
    bytes[3] = -4;
    System.out.println(Arrays.toString(bytes));
  }
}
