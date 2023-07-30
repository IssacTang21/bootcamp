public class Edge {
  
  private double length;
  private String color;
  private int id;
  private static int counter;

  public void setLength(double length){
    this.length = length;
  }

  public Edge(int id, double length, String color){
    this.id = ++counter;
    this.length = length;
    this.color = color;
  }

  public static void resetId(){
    counter = 0;
  }


  public void setColor(String color){
    this.color = color;
  }

  public String getColor(){
    return this.color;
  }

}
