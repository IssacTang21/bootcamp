

public class TestSynchronized {
  int number;

  public synchronized void increment(){ // Like a "Atomic" method
    this.number++; // non-atomic operation
  }

  public static void main(String[] args) {
    TestSynchronized i = new TestSynchronized();

    Runnable implement = () -> {
      for (int x = 0; x < 1000 ; x++){
       i.increment(); 
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
