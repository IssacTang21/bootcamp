package box;
import java.util.ArrayList;

public class Box<T extends Number>{

  private ArrayList<T> numbers;

 private Box(){
  numbers = new ArrayList<>();
 }
 public Box(T number){
  this(); // the empty constructor of Class Box
 numbers.add(number);
 }
 
  private ArrayList<T> getNumbers(){
  return this.numbers;
 }


 public void add(T number){
 numbers.add(number); // null number
 }

 public int size(){
  return numbers.size();
 }

// public void setNumbers(T[] numbers){
//   this.numbers = numbers;
// }

public static void main(String[] args) {
  // Box<String> box1 = new Box<>();
  Box<Number> box1 = new Box<>(); // compile-time check
  System.out.println(box1.size());



}


} 
