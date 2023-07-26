public class Itemdesc {

  private String header;
  
  private String body;

  public Itemdesc(String header, String body){
    this.header = header;
    this.body = body;
  }
  public static void main(String[] args) {
    Itemdesc itemA = new Itemdesc("item a", "90% discount");
    Itemdesc itemB = new Itemdesc("item a", "70% discount");
    Transaction t = new Transaction(1, itemA, 3, 10.3);
    Transaction t2 = new Transaction(1, itemB, 3, 10.3);
    Order order = new Order(new Transaction[]{t, t2});
    System.out.println(order.getTotal());
  }
}
