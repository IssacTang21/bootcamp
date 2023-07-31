public abstract class Adult extends Person {
  // abstract class extends abstract class
  // implicitly "extends" abstract method

  public abstract void read();

  public void eat(){
    System.out.println("i am adult, eating");
  }
}
