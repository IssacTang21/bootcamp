import java.util.Objects;

public class Balls {

  private String color;

  public Balls(String color) {
    this.color = color;
  }

  @Override
  public int hashCode(){
    // hash code is not unique representation of object reference
    return Objects.hash(this.color);
  }

  @Override
  public boolean equals(Object o) {
    // if address same, value inside the object must be same
    
    if (this == o)
    return true;
    if (!(o instanceof Balls))
      return false;
    Balls ball = (Balls) o; // downcast
    return ball.color.equals(this.color);
  }

@Override
public String toString(){
  return "color="+ this.color+"!";
}

  public static void main(String[] args) {
    Balls ball1 = new Balls("blue");// address 1
    Balls ball2 = new Balls("blue"); // address 2

    if (ball1.equals(ball2)) // checking color, insead of address
    System.out.println("they are same ball");

    System.out.println(ball2);// color = blue !
    System.out.println(ball2.toString()); // color = blue!
  }
}
