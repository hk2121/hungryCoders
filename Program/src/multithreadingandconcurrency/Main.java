package multithreadingandconcurrency;

// Define a class that extends Thread
class MyThread extends Thread{
public void run(){
    // Code to be executed by the thread
//    for(int i = 1; i<=5;i++){
        System.out.println("Thread running: " + Thread.currentThread().getName());

    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of MyThread
        MyThread myThread= new MyThread();
        // Start the thread
        myThread.start();
    }

}
