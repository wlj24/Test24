package thread.xmg;

import static java.lang.Thread.interrupted;

public class InterruptedThread {
    public static void main(String[] args) throws InterruptedException {
     Thread thread=new Thread(new MyThread());
     thread.start();
     thread.interrupt();
        Thread.sleep(1000);
        thread.interrupt();
    }

    private static class MyThread implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
               Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            while (!interrupted()){
                   System.out.println("11111");
               }
        }
    }
}
