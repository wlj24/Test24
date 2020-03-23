package lianxi.xmg;

public class DaemonThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(111);
                }
            }
        });
        thread.setDaemon(true);
        thread.start();
        Thread.sleep(10000);
    }
}
