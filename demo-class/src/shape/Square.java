public class Square {

  private final Double length = 3.0; // instance variable
  private final Edge[] edges; // instance variable

  public Square() {
    this.edges = new Edge[4]; // [null, null, null, null]
    this.edges[0] = new Edge(3.0, "red");
    this.edges[1] = new Edge(3.0, "yellow");
    this.edges[2] = new Edge(3.0, "black");
    this.edges[3] = new Edge(3.0, "blue");
  }

  public Square(double length){
    this.edges = new Edge[4]; 
    this.edges[0] = new Edge(length, "red");
    this.edges[1] = new Edge(length, "red");
    this.edges[2] = new Edge(length, "red");
    this.edges[3] = new Edge(length, "red");
  }

 public Edge[] getEdge(){
  return this.edges;
 }

  public static void main(String[] args) {
    Square square = new Square(3.0d);
    Square square2 = new Square(4.0d);
    square2.getEdge()[0].setColor("black");
    System.out.println(square2.getEdge()[0].getColor());
  }

}
