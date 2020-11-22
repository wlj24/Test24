package thread.xmg;

import a.E;

public class JoinThread {
    public static void main(String[] args) throws Exception {
     //  joinOnebyOne();
      // joinSpin();
        threadWait();

    }


    private static void threadWaitNotify(){
        Thread t1=new Thread(JoinThread::action,"t1");
        Thread t2=new Thread(JoinThread::action,"t2");
        Thread t3=new Thread(JoinThread::action,"t3");

    }

    private static void threadWait() throws InterruptedException{
        Thread t1=new Thread(JoinThread::action,"t1");
        Thread t2=new Thread(JoinThread::action,"t2");
        Thread t3=new Thread(JoinThread::action,"t3");
        threadStartAndWait(t1);
        threadStartAndWait(t2);
        threadStartAndWait(t3);
    }

    // Java Thread 对象和实际 JVM 执行的 OS Thread 不是相同对象
    // JVM Thread 回调 Java Thread.run() 方法，
    // 同时 Thread 提供一些 native 方法来获取 JVM Thread 状态
    // 当 JVM Thread 执行后，自动就 notify() 了

    private static void threadStartAndWait(Thread thread){
        if(Thread.State.NEW.equals(thread.getState())){
            thread.start();
        }
        while (thread.isAlive()){
            synchronized (thread){
                try {
                    thread.wait();
                }catch (Exception e){
                      e.printStackTrace();
                }
            }
        }
    }

    //自旋
    private static void joinSpin() throws Exception{
        Thread t1=new Thread(JoinThread::action,"t1");
        Thread t2=new Thread(JoinThread::action,"t2");
        Thread t3=new Thread(JoinThread::action,"t3");
        t1.start();
        while (t1.isAlive()){
        }
        t2.start();
        while (t2.isAlive()){
        }
        t3.start();
    }

    //join实现
    private static void joinOnebyOne() throws Exception{
        Thread t1=new Thread(JoinThread::action,"t1");
        Thread t2=new Thread(JoinThread::action,"t2");
        Thread t3=new Thread(JoinThread::action,"t3");
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t2.join();
        t3.start();
    }

    private static  void action(){
        System.out.printf("线程[%s] 正在运行\n",Thread.currentThread().getName());
    }
}
