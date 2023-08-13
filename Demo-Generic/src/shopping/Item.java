public abstract class Item {
  private int price;
  private String description;
  private String header;

public Item(){
  
}

  public Item(int price){
    this.price = price;
  }

  public int getPrice(){
    return this.price;
  }

}
