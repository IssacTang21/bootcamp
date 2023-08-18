public class Person {
  String name;
  int age;

  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }

  public int getAge(){
    return this.age;
  }
  
  public String getName(){
    return this.name;
  }

  public boolean isElderly(){
    return this.age >= 65;
  }
}
