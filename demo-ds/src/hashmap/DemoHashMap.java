package hashmap;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

  public static void main(String[] args) {
    // Background: String[int] , Array must use int as index
    // limitation: you can only access the element by int index
    // Solution: HahsMap<>
    HashMap<String, String> map = new HashMap<>();
    // <String, String> -> <key, value>
    map.put("abc", "hello world"); // entry
    map.put("bcd", "I am Developer"); // entry
    System.out.println(map.size()); // 2 entries
    // Map: Entry -> key + value

    // if Duplicated (equal(), hashCode()), override the entry
    map.put("abc", "hello world!");
    System.out.println(map.get("abc"));
    System.out.println(map.size()); // 2 entries

    System.out.println(map.isEmpty()); // false
    System.out.println(map.toString()); // {bcd=Iam Developer, abc=hello world!}
    System.out.println(map);// {bcd=Iam Developer, abc=hello world!}

    System.out.println((map.containsKey("abc"))); // true
    System.out.println(map.containsValue("I am Developer")); // true
    // if (map.containsKey("abc"))
    // return;

    for (Map.Entry<String, String> entry : map.entrySet()){
      System.out.println(entry.getKey()+":"+entry.getValue());
    }

    for (String key : map.keySet()){
      System.out.println(key);
    }

    for (String value : map.values()){
      System.out.println(value);
    }

    System.out.println(map.remove("abc")); // hello world!
    System.out.println(map.remove("bcd", "I am NOT Developer")); // false
    System.out.println(map.remove("bcd", "I am Developer")); // true
    
  }
}
