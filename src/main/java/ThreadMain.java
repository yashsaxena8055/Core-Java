import thread.Stack;
import thread.Thread1;

public class ThreadMain extends Main {
    public static void main(String[] args) {
       /*
       System.out.println("Inside ThreadMain's main method");
        Thread thread1 = new Thread1("Thread1");
        thread1.start();
        // below is preferable implementation to support multiple inheritance
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread() + " " + i);
            }
        }, "Thread2");
        thread2.start();
        Stack stack = new Stack(5);
        new Thread(()->{
            int counter = 0;
            while(++counter <10){
                System.out.println("PUSHED : " + stack.push(100));
            }
        },"Pusher").start();
        new Thread(()->{
            int counter = 0;
            while(++counter <10){
                System.out.println("POPPER : " + stack.pop());
            }
        },"Popper").start();
        System.out.println("Main is exiting");
        */

        // CREATING A DEADLOCK
        String lock1 = "lock1";
        String lock2 = "lock2";
        Thread thread1 = new Thread(()->{
            synchronized (lock1){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2){
                    System.out.println("lock is acquired");
                }
            }
        },"thread1");
        Thread thread2 = new Thread(()->{
            synchronized (lock2){
                try {
                    Thread.sleep(100);
                    System.out.println("here");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock1){
                    System.out.println("lock is acquired");
                }
                System.out.println("done");
            }
        },"thread2");
        thread1.start();
        thread2.start();
      //  System.out.println("helllo");
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main thread is exited");
   }
}
