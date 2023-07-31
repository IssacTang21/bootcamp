public class Student extends Adult {

  public Student(){
    super();
  }
  
  public void sleep(){
    System.out.println("i am student, sleeping");
  }

  public void read(){
    System.out.println("i am student, reading");
  }

  public static void main(String[] args) {
    Student student = new Student();
    student.sleep();
    student.run();
    student.read();
    student.eat();
    System.out.println(student.getAge()); // 0
  }
}
