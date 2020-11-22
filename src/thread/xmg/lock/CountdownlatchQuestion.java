package thread.xmg.lock;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountdownlatchQuestion {
    public static void main(String[] args) throws InterruptedException {
        CountdownlatchMake1 countDownLatch=new CountdownlatchMake1(5);
        ExecutorService executor= Executors.newFixedThreadPool(5);
        for(int i=0;i<5;i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            executor.submit(() -> {
                action();
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        System.out.println("over");
        executor.shutdown();
    }

    private static void action(){

        System.out.println(Thread.currentThread().getName()+"正在运行");
    }

}
