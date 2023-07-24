public class Computer {
  // attribute
  private int ram;
  private int weight;
  private String color;

  // constructors
  public Computer(String color) { // 1. no return type, 2. constructor name = class name
this.color = color;
  }

  public Computer(int ram, int weight, String color){
    this.ram = ram;
    this.weight = weight;
    this.color = color;
  }

  public void setRam(int ram) {
    this.ram = ram;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getColor(){
    return color;
  }
}
