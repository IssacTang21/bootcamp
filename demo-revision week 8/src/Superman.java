public class Superman implements Flyable{
  @Override
  public void fly(){
    System.out.println("I am flying");
  }

  public static void main(String[] args) {
    // 3 ways to new a flyable obj
    // 1. Polymorphism
    Flyable superman = new Superman();
    // 2. Anonymous
    Flyable superman2 = new Flyable() {
      @Override
    public void fly(){
    System.out.println("I am anonymous");
    }
  };
    // 3. Lambda
    Flyable superman3 = () -> System.out.println("I am Lambda");
  }
}
