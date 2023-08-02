public class ObjectDemo {
  // rule 1: all class extends object implicitly

  String name = "hello";

  // @Override
  // public String toString() {
  // return this.name;
  // }

  public static void main(String[] args) {
    // example 1: objectDemo extends object
    ObjectDemo objectDemo = new ObjectDemo();
    // hash code -> int
    objectDemo.hashCode(); // another presentation of object reference
    // because hash code has a shorter range of value storage
    // so it cannot store all memory address(object reference) in your machine

    int[] arr = new int[] { 1, 2, 3 };
    System.out.println(arr); // [I@6b95977

    String str = "abc";
    System.out.println(str);

    System.out.println(objectDemo);
    System.out.println(objectDemo.toString());
    System.out.println(str.hashCode()); // 96354
    // 97 * 31^2 + 98 * 31^1 + 99 * 31^0
    System.out.println(Math.pow(31, 2) * 97 + 98 * 31 + 99);

    Integer i1 = 3;
    System.out.println(i1.hashCode()); // 3
    Long l1 = 100l;
    System.out.println(l1.hashCode());// overflow

    ObjectDemo a = new ObjectDemo();
    ObjectDemo b = new ObjectDemo();
    System.out.println(a);
    System.out.println(b);

    // equals()
    String s1 = "abc";
    String s2 = "abc";
    System.out.println(s1.equals(s2)); // true

    Object obj = new String("new");
    System.out.println(obj instanceof String); // true
    obj = Long.valueOf(10);
    System.out.println(obj instanceof String); // false
    System.out.println(obj instanceof Long); // true

    Shape shape = new Circle10(5.0);
   // shape.print(); // no print() method of shape
   // hide child print() method 
   Circle10 c = (Circle10) shape;
    c.print(); // i am circle10

    // Number
    Integer int1 = Integer.valueOf(100);
    System.out.println(int1 instanceof Number); // true
    Double d1 = Double.valueOf(100);
    System.out.println(d1 instanceof Number); // true

    // primitive , for comparsion, we use ==

    // wrapper class equals
    Integer j1 =128;
    Integer j2 =128;
    System.out.println(j1.equals(j2)); // true
    j1=127;
    j2=127;
    System.out.println(j1.equals(j2));// true
    Boolean  bool1 = false;
    Boolean  bool2 = false;
    System.out.println(bool1.equals(bool2)); // true

    System.out.println(bool1.equals(false)); // Boolean -> boolean
    }

}
