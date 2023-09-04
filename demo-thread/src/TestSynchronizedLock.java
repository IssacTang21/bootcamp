public class TestSynchronizedLock {
  int x;
  Object lock1 = new Object();
  // Object lock2 = new Object();

  public int calculate(int amount) {
    int total = amount;
    synchronized (this.lock1) {
      this.x++;
    }
    // can be more than one synchronized code block
    // synchronized (lock1) {
    //   this.x++;
    // }
    return total + this.x;
  }

  public synchronized void increment() {
    this.x++;
  }

  public static void main(String[] args) throws InterruptedException {
    TestSynchronizedLock obj = new TestSynchronizedLock();

    Runnable implement = () -> {
      for (int x = 0; x < 100000; x++) {
        obj.calculate(0);
      }
    };

    Thread thread1 = new Thread(implement);
    Thread thread2 = new Thread(implement);

    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {

    }
    System.out.println(obj.x);
  }
}
