package engineering_digest.multithreading;

public class MyThread extends Thread {
public  MyThread(String name){
    super(name);
}

//    @Override
//    public void run() {
//        System.out.println("RUNNING");
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            System.out.println(e);        }
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//
//        MyThread t1 = new MyThread();
//        System.out.println(t1.getState());
//        t1.start();
//        System.out.println(t1.getState());
//        Thread.sleep(100);
//        System.out.println(t1.getState());
//        t1.join();
//        System.out.println(t1.getState());
//    }

@Override
    public void run(){
    for(int i = 0; i < 5; i++){
        String a = "";
        for(int j = 0;j < 1000000; j++){
            a+= "a";
        }
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(i);
        System.out.println(Thread.currentThread().getName() + " - Priority: "+ Thread.currentThread().getPriority() + " - count: "+i);
    try{
        Thread.sleep(100);
    }catch (Exception e){

        }
    }
}

    public static void main(String[] args) throws InterruptedException {
    MyThread l = new MyThread("Low Priority");
        MyThread m = new MyThread("Medium Priority");
        MyThread h = new MyThread("High Priority");

        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);
    l.start();
    m.start();
    h.start();
//    t1.join();
    }
}

