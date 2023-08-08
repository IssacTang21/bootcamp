import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class DemoArrayList2 {
  
  public static void main(String[] args) {
    // ArrayList String
    ArrayList<String> strs = new ArrayList<>();
    strs.add("abc");
    strs.add("def");
    strs.add("xyz");
    strs.add("def");
    System.out.println(strs.subList(1, 2)); // def,  from idx 1 to 1
    strs.remove("def"); // remove by Object, remove the first occurance of "def"
    System.out.println(strs);// [abc, xyz, def]
    strs.remove(1); // remove by idx
    System.out.println(strs); // [abc, def]

    Iterator<String> iterator = strs.iterator();
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }
    for (String s : strs){ // for-each support Array and ArrayList
      System.out.println(s);
    } 

    // array -> ArrayList
    String[] strings = new String[]{"hello" ,"world", "!"};

    List<String> s2 = new ArrayList<>();
    s2.add("abc"); // add() must be reflecting the add() in ArrayList

    // Read only -> big bug
     List<String> stringlist = Arrays.asList(strings);
    // stringlist.add("ijk"); // run-time error

    // read and write
     List<String> stringlist2 = new ArrayList<>(Arrays.asList(strings));
     stringlist2.add("ijk");
     System.out.println(stringlist2);
  }
}
