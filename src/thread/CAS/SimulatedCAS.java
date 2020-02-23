package thread.CAS;

public class SimulatedCAS {
    private volatile int value;

    public synchronized int get(){
        return value;
    }

    public synchronized int compareAndSwap(int expectedValue,int newValue){
        int oldValue=value;
        if(oldValue==expectedValue){
            value= newValue;
        }
        return oldValue;
    }

    public synchronized  boolean compareAndSet(int exceptedValue,int newValue){
        return exceptedValue==compareAndSwap(exceptedValue,newValue);
    }

}
