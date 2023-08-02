public class Cat extends GameMember implements Move{
  
  String name;

  @Override
  public void jump(){
    this.addScore(4);
  }

  @Override
  public void bigJump(){
    
  }

  @Override
  public void left(){

  }

   @Override
  public void right(){
    
  }

   @Override
  public void up(){
    System.out.println("cat moving up");
    super.addScore(1);
  }

   @Override
  public void down(){
    
  }
}
