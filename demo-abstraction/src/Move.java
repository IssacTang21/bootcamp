// before java 8, 100% abstract
public interface Move extends BigMove{
  
  // No instance variable ->carlcase

  // constant
  static final int MAX_SPEED = 10; // public

  
  // Java -> naming convention -> Carlcase
  // "noOfDay"

  // void up(); // public abstract
  // void down();
  // void left();
  // void right();
  void jump();

  // No method implementation

  // After Java 8, lamda, stream
  default void print(){  // instance method, implicitly public
    System.out.println("im java 8 default method");
  }

  static String concat(String a , String b){
    return a + b;
  }


}
