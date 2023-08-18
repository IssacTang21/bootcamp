public class DemoThread {
    public static void main(String[] args) throws Exception {
       // approach 1: Runnable (lambda) to implement Thread
       // Task logic
       Runnable printout = () -> {
        for ( int i = 0; i < 100 ; i++){
        System.out.println(i); // step 4
        }
    };
       // task
       Thread thread = new Thread(printout); // task management

       System.out.println("start thread"); // step 1
       thread.start(); // step 2
    //    for ( int i = 0; i < 100 ; i++){
    //    System.out.println("end thread"); // step 3
    //    }

       // approach 2: Create PrintOut class implement Runnable
       Thread thread2 = new Thread(new PrintOut());
       System.out.println("start thread 2");
       thread2.start();
       System.out.println("end thread 2");


       // approach 3: Create PrintOut2 Class extends Thread
       Thread thread3 = new Thread(new PrintOut2());
       thread3.start();

       try{
         thread.join();
         thread2.join();
         thread3.join();
       } catch(InterruptedException e){

       }

       System.out.println("Main Threaed end");
    }
}
