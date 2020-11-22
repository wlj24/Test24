package thread.ReentrantLock;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore=new Semaphore(0);

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(1);
                semaphore.release();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    semaphore.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(3);
            }
        });

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    semaphore.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(2);
                semaphore.release();
            }
        });
        thread1.start();
        thread.start();
    }
}
