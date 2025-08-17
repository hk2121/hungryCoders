package engineering_digest.multithreading;

public class Test {
    public static void main(String[] args) {


        Counter counter = new Counter();
        MyTread t1 = new MyTread(counter);
        MyTread t2 = new MyTread(counter);

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {

        }
        System.out.println(counter.getCount());
    }
}

