public class Dog extends GameMember implements Move {

  String name;

  @Override
  public void bigJump(){
    
  }

  @Override
  public void jump() {
    super.addScore(3);
  }

  @Override
  public void left() {

  }

  @Override
  public void right() {

  }

  @Override
  public void up() {
    System.out.println("dog moving up");
    super.addScore(2);
  }

  @Override
  public void down() {

  }

  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.print(); // print from GameMember or Move?
    // if inherit and interface have same method, will use inherit first 
  }
}
