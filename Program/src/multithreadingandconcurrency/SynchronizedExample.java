package multithreadingandconcurrency;

public class SynchronizedExample {
    private int count;

    public synchronized void increment(){
        count++;
    }
    public synchronized int getCount(){
        return count;
    }
}
