package person;

import java.util.List;

public interface Swimmable{
  
  public void swim();

  public static void start(List<? extends Swimmable> humans){
  // public static <T extends Swimmable> void start(List<T> humans){
   for (Swimmable human : humans){
    human.swim();
   }
  }
}
