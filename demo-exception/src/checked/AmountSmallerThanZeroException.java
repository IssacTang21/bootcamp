package checked;
public class AmountSmallerThanZeroException extends Exception{
  

  public AmountSmallerThanZeroException(String message){
    super(message);
  }
}
