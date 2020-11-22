package thread.xmg.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class CountdownlatchMake1 {
    private ReentrantLock reentrantLock=new ReentrantLock();
    Condition condition=reentrantLock.newCondition();
    private int count;

    public CountdownlatchMake1(int count){
        this.count=count;
    }

    public void countDown(){
           reentrantLock.lock();
           try {
            count--;
            if(count==0) {
                condition.signal();
            }
           }finally {
               reentrantLock.unlock();
           }
        }


    public void await() throws InterruptedException {
        reentrantLock.lock();
        try {
            while (count > 0) {
                condition.await();
            }
        }finally {
          reentrantLock.unlock();

        }
    }
}
