import java.util.Arrays;

public class Invoice {
  public static void main(String[] args){
    int[] quantities = new int[]{5, 10, 4, 7, 20};
    double[] unitPrices = new double[]{3.0, 2.1, 9.0, 1000.3, 10.9};
    // calcTotalItemPrice()
    // totalPriceItems = ...
    double[] totalPriceItems = new double[unitPrices.length];
    for ( int i = 0; i < totalPriceItems.length; i++){
      totalPriceItems[i] = calcTotalItemPrice(quantities[i], unitPrices[i] );
    }
    System.out.println(Arrays.toString(totalPriceItems));


    // loop
    double invoiceTotalAmount = calcInvoiceTotalAmount(totalPriceItems);
    System.out.println("the total amount of invoice is:" + invoiceTotalAmount);
  }

  // Task 1: a method to calculate item total price for an item
  public static double calcTotalItemPrice(int quantity, double price) { // 5 x 10.9
    // Early return
    // Parameter Control
    if (quantity < 0 || price < 0){
      return 0;
    }
    return quantity * price; // main logic
  }

  // Task 2: a method to calculate total amount of the invoice
  public static double calcInvoiceTotalAmount(double[] totalPriceItems) {
    double sum = 0;
    for (int i = 0; i < totalPriceItems.length; i++) {
    sum += totalPriceItems[i];
    }
    return sum;
  }

}
