package shape;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Shape {
  
  abstract double area();// implicity public

  public static<T extends Shape> double area(List<T> shapes){
  // public static double area(List<? extends Shape> shapes){
    BigDecimal total = BigDecimal.ZERO;
    // shapes.add(new Circle()); // compile-time error, type-safe
    for (Shape shape : shapes){
      total = total.add(BigDecimal.valueOf(shape.area()));
    }
  return total.doubleValue();
  }

  public static void main(String[] args) {
    // Polymorphism
    Shape shape = new Circle(); // polymorphism
    Shape shape2 = new Square(); // polymorphism
    ArrayList<Shape> shapes = new ArrayList<Shape>();
    // shapes = new ArrayList<Circle>(); // compile-error
    List<Shape> list2 = new ArrayList<>();
    List<? extends Shape> list = new ArrayList<Circle>();
    list = new ArrayList<Square>(); // OK
    // list.add(new Circle()); // compile check refer to declaration

    List<Map<String, String>> list3 = new ArrayList<>();
    list3.add(new HashMap<>());
  }
}
