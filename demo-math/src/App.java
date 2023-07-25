import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println(Math.round(5.6));
        System.out.println(Math.pow(5, 6));
        System.out.println(Math.sqrt(-5.6)); // NaN 負數無法計算

        int num = -56;
        if (num > 0 && Math.sqrt(num) == 5) { // if num <= 0 , exit
            // do something
        }

        // base10;
        // log10 = 1
        // log1000 = 3

        double number = 2;
        double naturalLog = Math.log(number);
        System.out.println(naturalLog);

        System.out.println(Math.sin(number));
        int sum = 0;
        int[] nums = new int[] { -100, 100, 90, 50 };
        for (int i = 0; i < nums.length; i++) {
            sum += Math.abs(nums[i]);
        }
        System.out.println(sum);
        double[] arr = new double[] { -5.63, 4.29, -50.6, -4.66 };
        for (int j = 0; j < arr.length; j++) {
            System.out.println(Math.abs(Math.round(arr[j])));
        }

        int cubeLength = 3;
        double volume = Math.pow(cubeLength, 3);
        System.out.println(volume);

        int[] base = new int[] { 2, 3, 4, 5 };
        int[] index = new int[] { 3, 4, 5, 6 };
        int[] result = new int[base.length];
        for (int i = 0; i < base.length; i++) {
            result[i] = (int)Math.pow(base[i], index[i]);
        }
        System.out.println(Arrays.toString(result));
    }
}
