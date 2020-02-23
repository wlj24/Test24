package thread;

import java.util.concurrent.TimeUnit;

public class ShutDown {
    public static void main(String[] args) throws InterruptedException {
        Runner runner=new Runner();
        Thread thread=new Thread(runner,"countThread");
        thread.start();
        TimeUnit.SECONDS.sleep(1);
        thread.interrupt();
        Runner runner1=new Runner();
        Thread thread1=new Thread(runner1,"countThread");
        thread1.start();
        TimeUnit.SECONDS.sleep(1);
        runner1.cancel();

    }

    private static class Runner implements Runnable{
        private long i;
        private volatile boolean on=true;

        @Override
        public void run() {
        while (on&&!Thread.currentThread().isInterrupted()){
            i++;
        }
            System.out.println("i:"+i);
        }

        public void cancel(){
            on=false;
        }
    }
}
