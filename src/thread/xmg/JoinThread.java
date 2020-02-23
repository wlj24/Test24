package thread.xmg;

import a.E;

public class JoinThread {
    public static void main(String[] args) throws Exception {
       joinOnebyOne();
       joinSpin();

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
