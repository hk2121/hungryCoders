package multithreadingandconcurrency;

public class VolatileExample {
    private volatile boolean flag;
    public void setFlag(boolean value){
        flag= value;
    }
    public boolean getFlag(){
        return flag;
    }
}
