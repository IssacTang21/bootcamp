package revision;
public class AbcException extends RuntimeException{
  // / by zero
  // null point
  // array size
  // concurrentModification
  public AbcException(){
    super("abc exception");
  }

  public static void main(String[] args) {
    int a = 10/0;
  }
}
