public class Car {
int noOfWheel;
int capacity;
String color;

public void setNoOfWheel(int noOfWheel){
  this.noOfWheel = noOfWheel;
}

public void setCapacity(int capacity){
  this.capacity = capacity;
}

public void setColor(String color){
  this.color = color;
}

public int getNoOfWheel(){
  return this.noOfWheel;
}

public int getCapacity(){
  return this.capacity;
}

public String getColor(){
  return this.color;
}

// empty constructor
public Car(){

}

// ALL-argument constructor (all parameter)
public Car(int noOfWheel, int capacity, String color){
  this.noOfWheel = noOfWheel;
  this.capacity = capacity;
  this.color = color;
}






}
