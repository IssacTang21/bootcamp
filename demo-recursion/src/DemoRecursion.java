public class DemoRecursion {
    public static void main(String[] args) {
        // algorithm ->algn
        System.out.println(sum2(6));
        print(3);
    }

    public static int sum(int k) {
        if (k < 1) // base condition
            return k;
        return k + sum(k - 1);
        // sum(5), return
        // 5+sum(4), return
        // 4+sum(3), return
        // 3+sum(2), return
        // 2+sum(1), return
        // 1+sum(0), return
        // 0 < 1, return 0;
    }

    // Question 2
    // 1, 1, 2, 3, 5, 8, 13 ..
    // k =7, return 8
    public static int sum2(int k) {
        if (k <= 1)
            return k;
        return sum2(k - 1) + sum2(k - 2);
    }

    //Question 3
    // non-tail recursion
    // 3 2 1 1 2 3 , k =3
    public static void print(int k){
        if ( k < 1)
        return;
      System.out.println(k+","); // 2
       print(k-1); // print(0)
       System.out.println(k+","); // 2 
      // if (k >)
    }
}
