public class Cat extends GameMember implements Move{
  
  String name;

  public Cat(String x){
    this.name = x;
  }
  @Override
  public void jump(){
    this.addScore(4);
  }

  public void print(String cat){
    System.out.println("cat"+ cat);
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
