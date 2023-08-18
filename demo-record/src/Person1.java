public record Person1(String name, int age) implements TestInterface{
  // immutable Object
  // final class, support Generic
  // support interface, but cannot further extend Parent class (extends Object)
  // private final String name;
  // private final int age;
  // All-args constructor only
  // all getters
  // no setters (final instance variable)
  // custom static methods, static variable
  // custom constant
  // custom instance methods
  // no other instance variable
  // already override equals(), hashcode(), toString()


  // int salary;

  static int counter = 2; // class variable

  static final int MAX_VALUE = 100; // constant

  public boolean isElderly(int age){
    return age >= 65;
  }


  // Tools
  public static int add(int x, int y){
    return x+y;
  }
  
}
