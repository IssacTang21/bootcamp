public class TestString {
  String str = " ";
  public static void main(String[] args) {
    TestString i = new TestString();
    Runnable append = () -> {
      for ( int x = 0; x < 100000; x++){
      i.str += ("s");
      }
    };

    Thread thread1 = new Thread(append);
    Thread thread2 = new Thread(append);
    thread1.start();
    thread2.start();
    try{
      thread1.join();
      thread2.join();
    } catch(InterruptedException e){

    }
    System.out.println(i.str.length());
  }
}
