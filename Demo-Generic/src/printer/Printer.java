// Generic
public class Printer<T> { // Class Signature, add<>, T represent any Type
  T value;
  T[] numbers;
  Object object;

  public T getValue(){
    return this.value;
  }

  public void setValue(T value){
    this.value = value;
  }

  public void print(){
    System.out.println(this.value);
  }

 public void setObject(Object object){
    this.object = object;
  }


  public Object getObject(){
    return this.object;
  }

  public static void main(String[] args) {
    Printer<String> printer = new Printer<>();
    // Strong Type checking -> check if you put a real class into <>

    Printer<Integer> p1 = new Printer<>();
    printer.setValue("abc");
    System.out.println(printer.getValue());

    Printer<Double> p2 = new Printer<>();
    p2.setValue(2.0);
    System.out.println(p2.getValue());

    Printer<Boolean> p3 = new Printer<>();
    p3.setObject("String");
    System.out.println(((String) p3.getObject()).charAt(0));
  }
}
