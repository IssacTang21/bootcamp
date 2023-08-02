import java.math.BigDecimal;

public abstract class Shape { // extends object implicitly
 
  public abstract double area();

  public static void main(String[] args) {
    double total = 0.0;
    BigDecimal b = BigDecimal.valueOf(total);
    b = b.add(BigDecimal.valueOf(5));
    System.out.println(b.doubleValue()); // 5.0

    // shape area() example
    Circle10 circle = new Circle10(10.0d);
    Square square = new Square(3.0d);
    Shape[] shapes = new Shape[]{circle, square};
    System.out.println(Shape.area(shapes)); // 10 * 10 * pi + 3 * 3

    
  }

  public static double area(Shape[] shapes){
     BigDecimal total = BigDecimal.valueOf(0);
    for (Shape s : shapes){
     total = total.add(BigDecimal.valueOf(s.area()));
    }
    return total.doubleValue();
  }

  
}
