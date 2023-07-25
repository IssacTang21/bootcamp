public class Person { // template
  // Describe the person by attribute
  private int age;
  private char gender; // week 6 -> enum
  // ...

  // getter
  public int getAge() {
    return this.age;
  }

  // setter
  public void setAge(int age) {
    this.age = age;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  public char getGender() {
    return gender;
  }

  public boolean isMale() {
    if (this.gender == 'f') {
      return false;
    }
    return true;
  }

  public static boolean isMale(char gender) { // belong to class
    if (gender == 'f') {
      return false;
    }
    return true;
  }

  public static void main(String[] args) {
    String c = new String("abc");// new an object in heap
    String c2 = "abc";// new an object in heap
    String c3 = String.valueOf("abcd"); // new an object in heap
    Boolean b2 = new Boolean("false");

    String s = "abc";
    Person p = new Person(); // Produce empty person object with default value
    Person p2 = new Person();// Produce empty person object with default value
    p.setAge(13);
    p2.setAge(20);
    p.setGender('m');
    p2.setGender('f');
    System.out.println(p.age);

    // static vs non-static
    // static
    System.out.println(isMale('f')); // false
    System.out.println(p.isMale());

  // //  Computer computer = new Computer(); // Computer() -> empty constructor
  //   computer.setColor("blue");
  //   computer.setRam(16);
  //   computer.setWeight(2);

    Computer computer2 = new Computer("yellow");
    computer2.getColor(); // yellow
    Computer computer3 = new Computer(16, 1, "yellow");
    computer3.getColor();
  }
}
