public class Circle10 extends Shape {
  
  private double radius;

  public Circle10(double length){
    this.radius = length;
  }

  @Override
  public double area(){
    return Math.pow(radius, 2) * Math.PI;
  }

  public void print(){
    System.out.println("im circle10");
  }
  
}
