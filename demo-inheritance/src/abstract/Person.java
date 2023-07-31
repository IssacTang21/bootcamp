public abstract class Person {
 
  private int age;
  private double height;

  public int getAge(){
    return this.age;
  }

  public double getHeight(){
    return this.height;
  }

  // may contain instance method with implementation
  public void run(){
    System.out.println("i am person, running");
  }

  //may contain abstract method without implementation
  public abstract void sleep();
}
