package thread.ReentrantLock;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Mutex implements Lock {
    private static class Sync extends AbstractQueuedSynchronizer{
        protected boolean isHeldExclusively(){
            return getState()==1;
        }

        public boolean tryAcquire(int acquires){
            if(compareAndSetState(0,1)){
                setExclusiveOwnerThread(Thread.currentThread());
                return true;
            }
            return false;
        }

        protected boolean tryRelease(int release){
            if(getState()==0) throw new IllegalMonitorStateException();
            setExclusiveOwnerThread(null);
            setState(0);
            return true;
        }

        Condition newCondition(){
            return newCondition();
        }
    }

    private final Sync sync=new Sync();
    @Override
    public void lock() {
      sync.acquire(1);
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        return sync.tryAcquire(1);
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {
      sync.release(1);
    }

    @Override
    public Condition newCondition() {
        return null;
    }

    public static void main(String[] args) {
        Integer a=4;
        Integer b=new Integer(4);
        System.out.println(a==b);
        String[] myArray = { "Apple", "Banana", "Orange" };
        List<String> myList = Arrays.asList(myArray);
        LinkedList<String> strings=new LinkedList<>();

    }
}
