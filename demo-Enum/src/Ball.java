public class Ball {

  public Color color;

  public Ball(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Ball))
      return false;
    Ball ball = (Ball) o;
    return this.color == ball.color;

  }

  public static void main(String[] args) {
    Ball ball = new Ball(Color.RED);
    System.out.println(ball.getColor().name());
    // compile-time Class "object" type check
    // reference presentation

    Object object = new Ball(Color.RED);
    object.hashCode();
    // compile-time check if Object class has hashCode() method
    // Compile-time check if Ball class inherit Object

    // Run-time object variable stores an address, point to a ball object in the
    // Run-time determine if Class Ball has hashCode() method
    // If no, then Invoke Class Object hashCode()
    // If yes, invoke the Class Ball hashCode()

    Color color = ((Ball) object).getColor(); // Compile-time type checking
    // Color extends Enums, class, Enum extends Object
    Class<?> clas = color.getClass();
    System.out.println(clas.getName()); // Color
    System.out.println(clas.toString()); // Color

    if (Color.BLUE instanceof Color)
    System.out.println("Color.blue is instance of Color");

    if (Color.BLUE.getClass() == Color.class) // true
    System.out.println("Color.blue is instance of Color");
    

    Object o = 1 -'a';// int -> Inetger
    System.out.println(o.getClass().getName()); //Integer
    Object o2  = '0';
    System.out.println(o2.getClass().getName()); //Character
    Object o3 = new Ball(Color.GREEN);
    System.out.println(o3.getClass().getName()); // Ball

  //  if (o3.getClass().isEnum())
    System.out.println(o3.getClass().isEnum()); // false
    System.out.println(clas.isEnum()); // true
  }
}
