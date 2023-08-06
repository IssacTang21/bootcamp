public enum Color {
  RED("#FF000"),
  BLUE("#0FF00"),
  GREEN("#000FF"),
  ;

  String code;
  static int num = 0;

  private Color(String code){
    this.code = code;
    num++;
  }

  public String getCode(){
    return this.code;
  }
}
