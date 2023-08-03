class Solution {
    public static int sumOddLengthSubarrays(int[] arr) {
      int sum = 0;
      
 for (int k = 0 ; k < arr.length; k++){
     if (k % 2 == 1)
    continue;
    else {
        int j = 0;;
        for ( int i = 0; i < arr.length; i++){
            if (i + k > arr.length)
            break;
        
        j = i;
        while (j < k + i)
            sum += arr[j];
            j++;
        }
    }
         
    }
    return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOddLengthSubarrays(new int[]{1,4,2,5,3}));
        System.out.println(2);
    }
}
