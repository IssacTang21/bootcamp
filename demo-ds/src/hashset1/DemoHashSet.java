package hashset1;

import java.util.HashSet;

public class DemoHashSet {
  public static void main(String[] args) {
    // Example 1: HashSet is good at handling duplicates
    HashSet<String> strings = new HashSet<>();
    System.out.println(strings.add("abc")); // true
    System.out.println(strings.add("def")); // true
    System.out.println(strings.size()); // 2

    // HashSet add()
    boolean result = strings.add("abc");
    System.out.println(strings.size()); // 2
    System.out.println(result); // false

    if (strings.add("def")) { // false
      System.out.println("def is added");
    } else {
      System.out.println("def is not added");
    }

    // Example 2:
    HashSet<Coordinate> coordinates = new HashSet<>();
    Coordinate c1 = new Coordinate(1, 1);
    Coordinate c2 = new Coordinate(1, 1);
    // c1.equals(c2)
    System.out.println(coordinates.add(c1)); // true
    System.out.println(coordinates.add(c2)); // false
    System.out.println(coordinates.size()); // 1

    Coordinate c3 = new Coordinate(2, 1);
    System.out.println(coordinates.add(c3)); // true
    System.out.println(coordinates.size()); // 2
  }
}
