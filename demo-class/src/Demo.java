public class Demo {
  public static void main(String[] args) {
    Car car = new Car();
    Person person = new Person();
    Car car2 = new Car(4, 7, "yellow");
    System.out.println(car2.getCapacity());
    System.out.println(car2.getColor());
    System.out.println(car2.getNoOfWheel());
    String str = new String("hello");
    car2.setColor("yellow");
    System.out.println(car2);
    car2 = new Car(2, 6, "black"); // car2(4, 7, "yellow") will auto jc
    car2 = null; // 把car2 指向 Car(2, 6, "black")的針斷開
    car2 = new Car(1, 2, "red");

    CarFactory carFactory = new CarFactory();
    carFactory.changeColor(car2, "white");
    System.out.println(car2.getColor()); // white

    Student student = new Student("Eric", "Chan", 30);
    
  }

}
