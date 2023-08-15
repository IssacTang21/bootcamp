package checked;

public class Student {
  String name;
  long pocketMoney;

  public Student(String name, long pocketMoney){
    this.name = name;
  }

 
  public void setName(String name) throws NameTooLongException{
     if (name.length()> 10)
      throw new NameTooLongException("Name is too long(> 10)");
      this.name = name;
  }

   public void setPocketMoney(long pocketMoney) throws AmountSmallerThanZeroException{
     if (pocketMoney <= 0)
      throw new AmountSmallerThanZeroException("money < 0");
      this.pocketMoney = pocketMoney;
  }

  public static void main(String[] args) {
    Student student = new Student("John", 1l);
    try {
    // student.setName("Peter abc abc abc"); // if exception, throw it to the caller
    // student.setPocketMoney(-3);
    // String[] arr =  new String[2] ;
    //   if ((arr[0].charAt(0))== '0')
    //   System.out.println("hi");
    int i = 10/0;
    } catch(Exception e){
      System.out.println("Student Setter issue, message:"+ e.getMessage());
    // } catch(Exception e){
    //   System.out.println(e.getMessage());// by zero
    } finally {
      System.out.println("finally");
    }

    // Student student2 = new Student();
    // Student student2.name.length(); 
  }
}
