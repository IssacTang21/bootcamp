public enum Orderstatus {
  ORDERED(0),
  PAID(1),
  SHIPPED(2),
  COMPLETED(3),
;
  int id;

  private Orderstatus(int id){
    this.id = id;
  }

  private int getId(){
    return this.id;
  }

  public boolean isForward(Orderstatus status){
    return status.getId() > this.id;
  }

  public static void main(String[] args) {
    System.out.println(Orderstatus.ORDERED.isForward(Orderstatus.PAID));
  }
}
