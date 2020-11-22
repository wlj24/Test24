package thread.xmg.lock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentranLockQuestion {
    static ReentrantLock reentrantLock=new ReentrantLock();
    public static void main(String[] args) {
     test(ReentranLockQuestion::action1 );
    }

    private static void action1(){
       test(ReentranLockQuestion::action2);
    }

    private static void action2(){
     test(ReentranLockQuestion::action3);
    }

    private static void action3(){
        System.out.println("hello world");
    }

    private static void test(Runnable runnable){
        reentrantLock.lock();
        try {
              runnable.run();
        }finally {
            reentrantLock.unlock();
        }
    }

}
