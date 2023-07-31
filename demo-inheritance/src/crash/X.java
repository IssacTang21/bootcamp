public class X extends Y {

  private String name;

  public X() {

  }

  public X(String name) {
    super("john");
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public String getParentName(){
    return super.getName();
  }

  public static void main(String[] args) {
    X x = new X("peter");
    System.out.println(x.getName()); // peter
    System.out.println(x.getParentName()); // john

    Y y = new X("tommy");
    y.staticMethod(); // i am y, hidding
    // you should practice and understood below syntax
    Y.staticMethod();// i am y
    X.staticMethod();// i am y

    System.out.println(y.getName()); // tommy
  }

  public static void staticMethod(){
    System.out.println("i am X");
  }
}
