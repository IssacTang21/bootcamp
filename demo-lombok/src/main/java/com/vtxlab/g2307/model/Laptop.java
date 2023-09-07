import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

 @Getter
@AllArgsConstructor
public class Laptop {
  private String os;
  @Setter
  private int memory;

 
  public static void main(String[] args) {
    Laptop laptop = new Laptop("windows", 32);
    System.out.println(laptop.getMemory());
    System.out.println(laptop.getOs());
    laptop.setMemory(64);
    // laptop.setOs("mac");
  }
}
