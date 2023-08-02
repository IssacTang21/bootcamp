public class Laptop extends Machine {
  // laptop is subclass (child), Machine is superclass (parent)
  // Inherit Machine "double weight";
  //

  private Keyboard keyboard;
  private Monitor monitor;
  int volume;

  // subclass must call superclass constructor

  public Laptop() {
    // super(1); // new Machine()
    // implicitly call superclass empty constructor
  }

  public Laptop(Keyboard keyboard, Monitor monitor) {
    // implicitly call superclass empty constructor
    this.keyboard = keyboard;
    this.monitor = monitor;
  }

  public Laptop(String buttonType, int noOfButton, double length, double width) {
    // implicitly call superclass empty constructor
    this.keyboard = new Keyboard(buttonType, noOfButton);
    this.monitor = new Monitor(length, width);
  }

  public Laptop(double weight, Keyboard keyboard, Monitor moniter) {
    super(weight); // new machine(5); <- super(); & this.setweight(weight);
    this.keyboard = keyboard;
    this.monitor = monitor;
  }

  @Override
  public boolean equals(Object o){
    if (this == o)
    return true;
    if (!(o instanceof Laptop))
      return false;
    Laptop laptop = (Laptop) o; // downcast
    return Object.equals(laptop.keyboard, this.keyboard) && Object.equals(laptop.monitor, this.monitor);
  }


  @Override // Method Overriding
  public void start() {
    super.start(); // machine start ...
    System.out.println("laptop start..");
  }

  @Override
  public void stop() {
    System.out.println("laptop stop..");
  }

  public void mute() {
    this.volume = 0;
  }

  public static void main(String[] args) {
    Laptop laptop = new Laptop("abc", 100, 15, 10);
    laptop.setWeight(3.0);
    System.out.println(laptop.getWeight()); // 3.0
    laptop.start(); // Laptop startt..
    laptop.stop(); // Laptop stop...

    Machine machine = new Machine();
    System.out.println(machine.getWeight());
    machine.start();// machine start..
    machine.stop();// machine stop..

    Laptop laptop2 = new Laptop(); // empty constructor
    laptop2.setWeight(10.0);
    System.out.println(laptop2.getWeight());

    Laptop laptop3 = new Laptop();
    System.out.println(laptop3.getWeight());

    System.out.println(Machine.staticMethod("abc", "xyz")); // abcxyz
    // laptop3.staticMethod("bac", "xyy"); // not recommanded

  }

}
