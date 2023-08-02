public class Square extends Shape {


  private double length;

  @Override
  public double area(){
    return Math.pow(length, 2);
  }

  public Square(double length){
    this.length = length;
  }
  
}
