import java.util.Vector;

public class TestVector {
  Vector<Integer> integers = new Vector<>();
  public static void main(String[] args) {
    TestVector t = new TestVector();
    Runnable append = () -> {
      for ( int x = 0; x < 100000; x++){
      t.integers.add(1);
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
    System.out.println(t.integers.size());
  }
}