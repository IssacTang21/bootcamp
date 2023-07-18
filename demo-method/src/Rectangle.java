public class Rectangle {
  public static void main(String[] args) {
    // area
    double area1 = area(5.0, 3.0);
    double area2 = area(13.0, 5.0);
    // perimeter
    double perimter1 = perimeter(10.0, 90.0);
    double perimter2 = perimeter(55.0, 44.0);
  }

  public static double area(double length, double width) {
    return length * width;
  }

  public static double perimeter(double length, double width) {
    return 2 * (length + width);
  }

  
}
