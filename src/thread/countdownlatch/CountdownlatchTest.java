package thread.countdownlatch;


import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class CountdownlatchTest implements Runnable {
    private final CountDownLatch countDown;
    static   int num=0;
    public CountdownlatchTest(CountDownLatch countDown) {
        this.countDown = countDown;
    }


    @Override
    public void  run() {
        int a= new Random().nextInt(5);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (CountdownlatchTest.class) {
            num += a;

        }

        System.out.println(Thread.currentThread().getName()+"输出  "+a);

    //    System.out.println(Thread.currentThread().getName()+"结果:"+num);


        countDown.countDown();

    }


    public static void main(String[] args) throws InterruptedException {
          CountDownLatch countDownLatch=new CountDownLatch(10);
          for(int i=0;i<10;i++){
              CountdownlatchTest countdownlatchTest=new CountdownlatchTest(countDownLatch);
              new Thread(countdownlatchTest).start();
          }
          countDownLatch.await();
        System.out.println("over");
        System.out.println(num);
    }
}
