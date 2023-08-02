import java.util.Objects;

public class Points {
  
  private int x;
  private int y;

  public Points(int x, int y){
    this.x = x;
    this.y = y;
  }
  

  public boolean equals(Object o){
    if (this == o)
    return true;
    if (!(o instanceof Points))
    return false;
    Points point = (Points) o;
//    return point .x == this.x && point.y == this.y;
   return Objects.equals(point.x, this.x) && Objects.equals(point.x, this.y);
}

    public static void main(String[] args) {
      Points p1 = new Points(1, 1);
      Points p2 = new Points(1, 1);
      Points p3 = new Points(0, 2);
      System.out.println(p1 == p2);
      System.out.println(p1.equals(p2)); // true
      System.out.println(p1.equals(p3));// false

      Long l =1L; // i, unbox -> primitive long
      int i =1; // 1, auto-box -> Integer
      Points.print(10L); // long -> autobox -> Long
      Points.print(Long.valueOf(10)); // Long object
      // Point.print(10); // cannot convert int to Long, compile error
      Points.print((long) 10); // int -> long -> autobox ->Long

      

      if (Long.valueOf("100")< 10L){ 
      // convert Long 100 -> long 100
      // 10L -> int
      // long vs int

      }

      if(Boolean.valueOf(false) == (false)){
        // right false -> Boolean
        // left: Boolean false -> boolean false
        // boolean vs boolean
      }

       if(Boolean.valueOf(false).equals(false)){
        // right false -> Boolean
        // left: Boolean false -> boolean false
        // boolean vs boolean
      }

    }
}
