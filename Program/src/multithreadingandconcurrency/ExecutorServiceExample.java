package multithreadingandconcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {

        // Fixed Thread Pool
        // Create a FixedThreadPool with 3 threads
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);

        System.out.println("\nFixed Thread Pool:");
        // Submit tasks to the FixedThreadPool
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            fixedThreadPool.execute(() -> {
                //Task Execution
                System.out.println("Fixed Thread Task " + taskId + "executed by Thread : " + Thread.currentThread().getName());
            });
        }
        // Cached Thread Pool
// Create a CachedThreadPool
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        System.out.println("\nCached Thread Pool:");
// Submit tasks to the CachedThreadPool
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            cachedThreadPool.execute(() ->  {
                //Task Execution
                System.out.println("Single Thread Task "+taskId +" executed by Thread :"+Thread.currentThread().getName());
            });
        }

    }
}



