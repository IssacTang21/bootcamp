import java.util.Arrays;
import java.util.Random;

public class Demo {

    int age;

    public static void main(String[] args) {
        int[] nums = new int[3];
        // int[] nums = new int[3];
        // int[] nums; -> declaration
        // new int[3]; -> initialization
        nums = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // reassignment

        int[][] matrix = new int[3][4]; // new int[row][column];
        // 3 row x 4 column
        // 1, 2, 3, 10
        // 4, 5, 6, 7
        // 10, 2, 3, 1

        // random a number and assign to an 2D array 12 (0-12);
        for (int i = 0; i < matrix.length; i++) {
            // matrix[0] -> return int[]
            // matrix[0][2] -> get the idx 2 from the array of the row 0
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = new Random().nextInt(12);
                // System.out.println(matrix[i][j]);
            }
        }
        System.out.println(Arrays.deepToString(matrix));

        int[] arr = new int[matrix.length * matrix[0].length]; // 12
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                arr[j + matrix[0].length * i] = matrix[i][j];
            }
        }
        System.out.println(Arrays.toString(arr));

        String str = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                str += matrix[i][j];
            }
        }
        System.out.println(str);

        // 3D array
        int[][][] arr3d = new int[1][2][3];
        // 4D array
        int[][][][] arr4d = new int[1][2][3][4];

        Demo[][] demo = new Demo[2][2];
        demo[0][0] = new Demo();
        demo[0][1] = new Demo();
        demo[1][0] = new Demo();
        demo[1][1] = new Demo();

        String[][] strings = new String[][] { { "abc", "def" }, { "xyz", "ijk" } };
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[0].length; j++) {
                System.out.println(strings[i][j]);
            }
        }

        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[0].length; j++) {
                System.out.println(demo[i][j].age); // 0, default value
            }
        }
    }

}
