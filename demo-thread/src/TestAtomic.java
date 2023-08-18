import java.util.concurrent.atomic.AtomicInteger;

public class TestAtomic {
  AtomicInteger number = new AtomicInteger(0);

  public static void main(String[] args) {
    TestAtomic i = new TestAtomic();
    // i.number++; // Non-Atomic Operation
    // System.out.println(i.number); // i

    Runnable implement = () -> {
      for (int x = 0; x < 1000 ; x++){
       i.number.incrementAndGet(); // i.number++
      }
    };

    Thread thread1 = new Thread(implement);
    Thread thread2 = new Thread(implement);

    thread1.start();
    thread2.start();

    try{
      thread1.join();
      thread2.join();
    } catch(InterruptedException e){

    }
    System.out.println(i.number);
  }
}
