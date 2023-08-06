public enum Currency {
  USD(1, "US Dollar"),
  GBP(2, "Hong Kong Dollar"),
  CNY(3, "Chinese Yuan Reminbi"),
  HKD(4, "British Pound Starling"),
  ;

  private String desc;
  private int id;

  private Currency(int id,String desc) {
    this.desc = desc;
    this.id = id;
  }

  public String getDesc(){
    return this.desc;
  }

  public int id(){
    return this.id;
  }

  public static Currency getCurrency(int id){
    // values
    for (Currency x : Currency.values()){
      if (x.id == id)
      return x;
    }
  return null;
  }

  public static void main(String[] args) {
    System.out.println(Currency.valueOf("HKD").getDesc()); // hong kong dollar
   // System.out.println(Currency.valueOf("HKDS")); // not found, error
  }
}
