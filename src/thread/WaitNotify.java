package thread;

import java.util.concurrent.TimeUnit;

public class WaitNotify {
    static boolean flag=true;
    static Object lock=new Object();

    public static void main(String[] args) throws InterruptedException {
     Thread thread=new Thread(new Wait(),"waitThread");
     thread.start();
     TimeUnit.SECONDS.sleep(1);
     Thread thread1=new Thread(new Notify(),"notify");
     thread1.start();

    }

    static class Wait implements Runnable{

        @Override
        public void run() {
            synchronized (lock){
                while (flag){
                    System.out.println(Thread.currentThread()+"flag true");
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread()+"flag flase");
            }
        }
    }

    static class Notify implements Runnable{

        @Override
        public void run() {
            synchronized (lock){
                System.out.println(Thread.currentThread()+"notify");
                lock.notifyAll();
                flag=false;
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock){
                    System.out.println(Thread.currentThread()+"block again");
                    try {
                        TimeUnit.SECONDS.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
