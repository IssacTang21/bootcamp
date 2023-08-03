public enum Direction { // special keyword since java 1.5
  // 1.public class Direction extends Enum
  // 2.Enum is final class

  // 全局唯一
  // new direction("E")
  EAST('E', 90),
  SOUTH('S', 180),
  WEST('W', 270),
  NORTH('N', 360);

 private char direction;
 private int degree;


  private Direction(char direction, int degree){
    this.direction = direction;
    this.degree = degree;
  }

  public char getDirection(){
    return this.direction;
  }

  public int getDegree(){
    return this.degree;
  }

  

}