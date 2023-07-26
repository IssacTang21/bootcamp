public class Order {

 private Transaction[] transaction;
  
  public Order(Transaction[] transaction){
    // pass by reference
    this.transaction = transaction;
  }

  // getTotal -> sum up subtotal
}
