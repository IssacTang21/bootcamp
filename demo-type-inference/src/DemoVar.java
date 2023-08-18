import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoVar {
   // var age; // not allowed

    public static void main(String[] args) throws Exception {
        var s = "hello";
        // s = 3; // error, compile-check -> string
        var i = 2;
        var c = 'a';
        // var n; // not allowed
        // var n = null; // not allowed , compiler cannot refer the actual type
        // var[] arr = new int[3]; // not allowed

        // loop
        List<String> strings = Arrays.asList("abc", "def");
        for (var str : strings) {
            System.out.println(str);
        }

        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        var result = getString();
        result.add(Arrays.asList("def", "xyz"));
        result.add(Arrays.asList("ijk"));
    }

    

    public static List<List<String>> getString() {
        return Arrays.asList(Arrays.asList("abc")); 
    }

    // Not allowed
    // public static var add(int x, int y) {
    //     return x+y; 
    // }

    // Not allowed
    // public static String add(var x, var y){
    //     return x+y;
    // }
}
