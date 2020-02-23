package thread;

import java.util.concurrent.TimeUnit;

public class Interrupted {
    public static void main(String[] args) throws Exception {
     Thread thread=new Thread(new SleepRunner(),"sleepThread");
   //  thread.setDaemon(true);
     Thread busThread=new Thread(new BusRunner(),"busThread");
  //   busThread.setDaemon(true);
     thread.start();
     busThread.start();
     TimeUnit.SECONDS.sleep(5);
     thread.interrupt();
     busThread.interrupt();
        System.out.println("sleepThread"+thread.isInterrupted());
        System.out.println("busThread"+busThread.isInterrupted());
        TimeUnit.SECONDS.sleep(2);
    }

    static class SleepRunner implements Runnable{

        @Override
        public void run() {
            while (true){
                try {
                    TimeUnit.SECONDS.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    static class BusRunner implements Runnable{

        @Override
        public void run() {
            while (true){

            }
        }
    }
}
