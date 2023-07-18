public class Circle {
  public static void main(String[] args) {
    double area = circleArea(4.5d);
    double perimeter = perimeter(4.5d);
  }

  public static double circleArea(double radius) {
    return radius * radius * 3.14;
  }

  public static double perimeter(double radius){
    return 2 * radius * 3.14;
  }
}
