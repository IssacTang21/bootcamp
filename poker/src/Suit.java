public enum Suit {
  DIAMOND(4),CLUB(3),HEART(2),SPADE(1)
;

int number;
  private Suit(int number){
    this.number = number;
  }

public int getNumber(){
  return this.number;
}
  public int compare(Suit suit){
    if (this.number == suit.getNumber())
    return 0;
    else if (this.number > suit.getNumber())
    return -1;
    else return 1;
  }
}
