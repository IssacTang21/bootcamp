public abstract class GameMember {

  int score;

  public int getScore() {
    return this.score;
  }

public void print(){
  System.out.println("GameMember is jumping");
}

public abstract void up();

  public void addScore(int score) {
    this.score += score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public abstract void down();

  public abstract void left();

  public abstract void right();

  public static void upOnce(GameMember... members) { // multiple arg
    for (GameMember member : members) {
      member.up(); // dog:2 / student:1
    }
  }

  public static void moveOnce(Move[] members) {
    for (Move member : members) {
      member.jump();
    }
  }

  public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();
    GameMember.upOnce(dog, cat);
    System.out.println(dog.getScore()); // 2
    System.out.println(cat.getScore()); // 1

    Move[] members = new Move[] {dog, cat};
    GameMember.moveOnce(members);
    System.out.println(dog.getScore()); // 5
    System.out.println(cat.getScore()); // 5 (1+4)

    // Interface Move default instance Method
    dog.print();
    cat.print();
    // static method
    System.out.println(Move.concat("dog", "cat"));


    //
    Cow cow = new Cow();
    cow.print();
  }
}
