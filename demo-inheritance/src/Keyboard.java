import java.security.Key;

public class Keyboard {
  
  String buttontype;
  int noOfButton;

  public Keyboard(String buttontype, int noOfButton){
    this.buttontype = buttontype;
    this.noOfButton = noOfButton;
  }

  @Override
  public boolean equals(Object o){
    if (this == o)
    return true;
    if (!(o instanceof Keyboard))
      return false;
    Keyboard keyboard = (Keyboard) o; // downcast
    return Object.equals(keyboard.buttontype, this.buttontype) && Object.equals(keyboard.noOfButton, this.noOfButton);
  }

  public String getButtonType(){
    return this.buttontype;
  }

  public int getNoOfButtontype(String noOfButton){
    return this.noOfButton;
  }
}
