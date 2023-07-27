public class Circle {

  private int id;
  private double radius;

  // static ->shared variable
  // final -> one time initialization only
  private static final double pi = 3.1415; // static variable / class variable

  private static int counter; // calculate the number of circle being created

  public Circle() {
    Addcounter();
    this.id++;
  }

public int getId(){
  return this.id;
}

  public static void Addcounter(){
    counter++;
  }

  public void setRadius(double radius) { // instance method
    this.radius = radius;
  }

  public double area() {
    return this.radius * this.radius * pi;
  }

  public double perimeter() {
    return this.radius * 2 * pi;
  }

  public static void main(String[] args) {
    Circle circle = new Circle();
    circle.setRadius(2);
    circle.area();
    circle.perimeter();

    Circle circle2 = new Circle();
    circle2.setRadius(5);
    circle2.area();
    circle2.perimeter();

  }
}
