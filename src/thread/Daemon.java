package thread;

import java.util.concurrent.TimeUnit;

public class Daemon {
    public static void main(String[] args) {
        Thread thread=new Thread(new DaemonRunner(),"test");
        thread.setDaemon(true);
        thread.start();

    }

    static class DaemonRunner implements Runnable{

        @Override
        public void run() {
            try {
                System.out.println("1111");
                TimeUnit.SECONDS.sleep(10);
                System.out.println("22222");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                System.out.println("11111");
            }
        }
    }
}
