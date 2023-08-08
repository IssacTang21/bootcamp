
package hashmap;
public class Book2 {
  
  String name;
  String author;


public Book2(String name, String author){
  this.name = name;
  this.author = author;
}

public String getName(){
  return this.name;
}

public String getAuthor(){
  return this.author;
}
@Override
public String toString(){
  return "["+this.author+this.name+"]";
}

}
