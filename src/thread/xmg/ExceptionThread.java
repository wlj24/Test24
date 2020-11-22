package thread.xmg;

public class ExceptionThread {
    public static void main(String[] args) throws InterruptedException {
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("Thread:" + t + " Exception message:" + e);
            }
        });
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
             throw new RuntimeException("线程异常");
            }
        });
        thread.start();
        thread.join();
        System.out.println(thread.isAlive());
    }
}
