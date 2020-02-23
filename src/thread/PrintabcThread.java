package thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintabcThread implements Runnable{
    private String name;
    private Lock lock;
    private Integer flag;
    public static int count=0;
    public static final int MAX=30;

    public PrintabcThread(String name,Lock lock,Integer flag){
        this.name=name;
        this.lock=lock;
        this.flag=flag;
    }
    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (count >= MAX) {
                lock.unlock();
                return;
            }

            if (count % 3 == flag) {
                System.out.println(name);
                count++;
            }
            lock.unlock();
        }

    }

    public static void main(String[] args) {
        final Lock lock = new ReentrantLock();
        Thread a = new Thread(new PrintabcThread("A", lock, 0));
        Thread b = new Thread(new PrintabcThread("B", lock, 1));
        Thread c = new Thread(new PrintabcThread("C", lock, 2));

        a.start();
        b.start();
        c.start();
    }

}
