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

  public Square(double length) {
    if (length <= 0.0)
     length =1.0;
     int id = 0;
    this.edges = new Edge[4];
    this.edges[0] = new Edge(++id, length, "red");
    this.edges[1] = new Edge(++id, length, "red");
    this.edges[2] = new Edge(++id, length, "red");
    this.edges[3] = new Edge(++id, length, "red");
//    Square.resetId();
  }

  public Edge getEdge(int edgeId){
    return this.edges[edgeId-1];
  }

  public void modify(double length) {
    this.edges[0].setLength(length);
    this.edges[1].setLength(length);
    this.edges[2].setLength(length);
    this.edges[3].setLength(length);
  }

  public void modify(String color) {
    this.edges[0].setColor(color);
    this.edges[1].setColor(color);
    this.edges[2].setColor(color);
    this.edges[3].setColor(color);
  }

  public void modify(int edgeId, String color){
    this.getEdge()[edgeId].setColor(color);
  }

  // public void setEdge(Edge[] edges) {
  //   this.edges = edges;
  // }

  private Edge[] getEdge() {
    return this.edges;
  }



}
