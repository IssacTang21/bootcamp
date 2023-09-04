public class Card {
 private Suit suit;
 private Rank rank;

 private Card(Rank rank, Suit suit){
    this.suit = suit;
    this.rank = rank;
 }

 private Rank getRank(){
    return this.rank;
 }

 private Suit getSuit(){
    return this.suit;
 }

 public static Card of(Rank rank, Suit suit)  {
    return new Card(rank, suit);
 }

 public static int compare(Card card){
   if ()
 }
}
