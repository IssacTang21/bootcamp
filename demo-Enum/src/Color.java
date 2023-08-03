public enum Color {
  RED("#FF000"),
  BLUE("#0FF00"),
  GREEN("#000FF"),
  ;

  String code;

  private Color(String code){
    this.code = code;
  }

  public String getCode(){
    return this.code;
  }
}
