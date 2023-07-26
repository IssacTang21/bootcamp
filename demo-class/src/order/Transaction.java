public class Transaction {

  int itemNo;

  Itemdesc itemDesc;

  int quantity;

  double unitPrice;

  public int getItemNo(int itemNo){
    return this.itemNo;
  }

  public Itemdesc getItemDesc(Itemdesc itemDesc){
    return this.itemDesc;
  }

  public int getQuantity(int quantity){
    return this.quantity;
  }

  public double getUnitPrice(double unitPrice){
    return this.unitPrice;
  }

  public Transaction(int itemNo, Itemdesc itemDesc, int quantity, double unitPrice){
    this.itemNo = itemNo;
    this.itemDesc = itemDesc;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
  }

  
}
