package multithreadingandconcurrency;

// Define a class that implements the Runnable interface
class MyRunnable implements Runnable{
    public void run(){
        // Code to be executed by the thread
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}
public class Main1 {
    public static void main(String[] args) {
        // Create an instance of MyRunnable
        MyRunnable myRunnable = new MyRunnable();
        // Create a Thread instance and pass MyRunnable as a parameter
        Thread thread = new Thread(myRunnable);
        // Start the thread
        thread.start();
    }
}
