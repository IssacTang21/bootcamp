import java.util.ArrayList;
import java.util.Arrays;

public class DemoArrayList {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Integer[] integers = new Integer[3];
        // fixed length
        // for each primitive and class
        // resize, create new object
        integers = new Integer[] { 1, 3, 2, 4 };
        // Integers[2] = "abc" //compile-time error

        // Declaration
        ArrayList<Integer> numbers;
        // Initialization, create arraylist object
        numbers = new ArrayList<>();

        ArrayList<Integer> numbers2 = new ArrayList<>(); // empty array
        numbers2.add(1); // length 1 array
        numbers2.add(3); // length 2 array
        numbers2.add(4); // length 3 array
        numbers2.add(2); // length 4 array
        numbers2.add(null);// length 5 array
        // numbers2.add(Long.valueOf(0));// cannot cast Long to Integer
        // variable-length
        System.out.println(numbers.size()); // 5

        // conversion, Arraylist -> Array
        Integer[] arr2 = new Integer[numbers.size()];
        arr2 = numbers2.toArray(arr2); // define output array type for toArray() conversion
        System.out.println(Arrays.toString(arr2));// [1, 3, 4, 2]

        // ArrayList<int>, not support primitive

        for ( int i = 0; i < numbers2.size(); i++){
            System.out.println(numbers2.get(i));
        }

        int original2 = numbers2.set(2, 100);
        System.out.println(original2); // 2

        System.out.println(numbers2.isEmpty());// false
        System.out.println(numbers2.size()==0);// false

        ArrayList<Integer> numbers3 = new ArrayList<>();
        numbers3.add(1000);
        numbers3.add(2000);

        numbers2.addAll(numbers3); // add all element from numbers3 to numbers2
        System.out.println(numbers2.size()); // 7

        //remove
        numbers2.remove(2);
        System.out.println(numbers2.size()); // remove Integer 100

        numbers2.removeAll(numbers3);
        System.out.println(numbers2.size()); // 4

        System.out.println(numbers2.indexOf(1000)); // -1
        System.out.println(numbers2.lastIndexOf(3)); // 1

        System.out.println(numbers2); // (1 ,3 ,2 ,null)

        System.out.println(numbers2.contains(3)); // true
        System.out.println(numbers2.contains(900)); // false
        System.out.println(numbers2.containsAll(numbers3)); // false

        numbers2.add(1, 4); // insert
        System.out.println(numbers2); // [1, 4, 3, 2, null]

        numbers2.add(3);
        // find the last occurance of element 3
        System.out.println(numbers2.lastIndexOf(3)); // 4

        numbers2.clear(); // remove all elements
        System.out.println(numbers2.size()); // 0

        Object[] objects = numbers2.toArray(); // ArrayList<Integer> -> Object[]
        for (Object o : objects){
            if (o instanceof Integer){
                Integer num = (Integer) o;
                System.out.println(num);
            }
        }
    }
}
