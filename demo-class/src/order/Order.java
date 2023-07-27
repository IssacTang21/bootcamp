public class Order {

 private Transaction[] transactions;
  
  public Order(Transaction[] transaction){
    // pass by reference
    this.transactions = transaction;
  }

  // getTotal -> sum up subtotal
  public double getTotal(){
    double sum =0;
    for (int i = 0; i < this.transactions.length; i++){
      sum += this.transactions[i].subTotal(); // object.method()
    }
    return sum;
  }
}
