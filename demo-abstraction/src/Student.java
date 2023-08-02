public class Student extends Person implements Runnable, Swimmable, Move {
  
  private Student name;
  int score = 1;
  @Override
  public void run(){
    System.out.println("student is running");
  }

  @Override
  public void swim(){
    System.out.println("student is swimming.");
  }
  
  @Override
  public void breath(){
    System.out.println("student is breathing");
  }

  @Override
  public void left(){

  }

   @Override
  public void right(){
    
  }

   @Override
  public void jump(){
    this.score += 1;
  }

   @Override
  public void down(){
    
  }

  public static void main(String[] args) {
    System.out.println(Move.MAX_SPEED); // 10
  
  Move move = new Student();
  move.up();
  move.down();
  move.left();
  move.right();
//  System.out.println(Move.MAX_SPEED); // not recommand
 
    Swimmable swimmable = new Student();
    swimmable.swim();

    Person person = new Student();
    person.breath();
    person.getAge();

    Move dog = new Dog();
    dog.down();
    dog.up();
    dog.left();
    dog.right();
}


}
