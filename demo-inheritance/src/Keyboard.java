public class Keyboard {
  
  String buttontype;
  int noOfButton;

  public Keyboard(String buttontype, int noOfButton){
    this.buttontype = buttontype;
    this.noOfButton = noOfButton;
  }

  public String getButtonType(){
    return this.buttontype;
  }

  public int getNoOfButtontype(String noOfButton){
    return this.noOfButton;
  }
}
